package master.springbootmvc.tmall.controller;

import lombok.extern.slf4j.Slf4j;
import master.springbootmvc.tmall.model.UserInformation;
import master.springbootmvc.tmall.model.UserPassword;
import master.springbootmvc.tmall.service.UserInformationService;
import master.springbootmvc.tmall.service.UserPasswordService;
import master.springbootmvc.tmall.token.TokenProcessor;
import master.springbootmvc.tmall.utils.SaveSession;
import master.springbootmvc.tmall.utils.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * <br>〈用户〉<br>
 *
 * @author Administrator
 * @created 2020/8/21
 * @since 1.0.0
 */
@Controller
@Slf4j
public class UserController {
    @Resource
    private UserInformationService userInformationService;

    @Resource
    private UserPasswordService userPasswordServices;

    @GetMapping(value = {"/", "/login"})
    public String login(HttpServletRequest request, Model model) {
        String token = TokenProcessor.getInstance().makeToken();
        System.out.println("进入登录界面，token:" + token);
        request.getSession().setAttribute("token", token);
        model.addAttribute("token", token);
        return "page/login_page";
    }


    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        try {
            request.getSession().removeAttribute("userInformation");
            request.getSession().removeAttribute("uid");
            System.out.println("logout");
        } catch (Exception e) {
            return "redirect:home";
        }

        return "page/login_page";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Model model, @RequestParam String name, @RequestParam String phone, @RequestParam String password) {
        UserInformation userinformation = new UserInformation();
        userinformation.setUsername(name);
        userinformation.setPhone(phone);
        userinformation.setModified(new Date());
        userinformation.setCreatedtime(new Date());
        if (userInformationService.insert(userinformation) == 1) {
            int uid = userInformationService.selectIdByPhone(phone);
            UserPassword userPassword = new UserPassword();
            userPassword.setUid(uid);
            userPassword.setPassword(StringUtils.getInstance().getMD5(password));
            userPassword.setModified(new Date());
            int result = userPasswordServices.insert(userPassword);
            if (result != 1) {
                model.addAttribute("result", "fail");
            }
            model.addAttribute("result", "success");
            return "success";
        }
        model.addAttribute("result", "fail");
        return "success";
    }


    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, @RequestParam String phone,
                              @RequestParam String password, @RequestParam String token) {
        String loginToken = (String) request.getSession().getAttribute("token");
        if (StringUtils.isEmpty(phone) || StringUtils.isEmpty(password)) {
            return "rediret:login";
//            return BaseResponse.fail("redirect:/login");
        }
        if (StringUtils.isEmpty(token) || !org.apache.commons.lang3.StringUtils.equals(token, loginToken)) {
            return "redirect:/login";
//            return BaseResponse.fail("redirect:/login");
        }

        boolean b = getId(phone, password, request);
        if (!b) {
            return "page/login_page";
//            return BaseResponse.fail("redirect:/login");
        }

        return "redirect:/index";
//        return BaseResponse.success("登录成功");

    }


    @RequestMapping(value = "/personal_info")
    public String personalInfo(HttpServletRequest request, Model model) {
        UserInformation userInformation = (UserInformation) request.getSession().getAttribute("userInformation");
        if (StringUtils.getInstance().isNullOrEmpty(userInformation)) {
            return "redirect:/login";
        }
        String personalToken = TokenProcessor.getInstance().makeToken();
        request.getSession().setAttribute("personalToken", personalToken);
        model.addAttribute("token", personalToken);
        model.addAttribute("userInformation", userInformation);
        return "page/personal/personal_info";
    }


    public boolean getId(String phone, String password, HttpServletRequest request) {
        int uid = userInformationService.selectIdByPhone(phone);
        if (uid == 0 || StringUtils.getInstance().isNullOrEmpty(uid)) {
            return false;
        }
        UserInformation userInformation = userInformationService.selectByPrimaryKey(uid);
        if (null == userInformation) {
            return false;
        }

        String md5 = StringUtils.getInstance().getMD5(password);
        UserPassword userPassword = userPasswordServices.selectByUid(uid);
        if (!org.apache.commons.lang3.StringUtils.equals(md5, userPassword.getPassword())) {
            return false;
        }
        request.getSession().setAttribute("userInformation", userInformation);
        request.getSession().setAttribute("uid", uid);
        SaveSession.getInstance().save(phone, System.currentTimeMillis());
        return true;

    }
}
