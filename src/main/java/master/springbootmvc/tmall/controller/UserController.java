package master.springbootmvc.tmall.controller;

import lombok.extern.slf4j.Slf4j;
import master.springbootmvc.tmall.model.UserInformation;
import master.springbootmvc.tmall.model.UserPassword;
import master.springbootmvc.tmall.service.UserInformationService;
import master.springbootmvc.tmall.token.TokenProcessor;
import master.springbootmvc.tmall.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/21
 * @since 1.0.0
 */
@Controller
@Slf4j
public class UserController {
    @Autowired
    private UserInformationService userInformationService;

    @GetMapping(value = "/login")
    public String login(HttpServletRequest request, Model model) {
        String token = TokenProcessor.getInstance().makeToken();
        log.info("进入登录界面，token:"+token);
        request.getSession().setAttribute("token",token);
        model.addAttribute("token",token);
        return "page/login_page";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        try {
            request.getSession().removeAttribute("userInformation");
            request.getSession().removeAttribute("uid");
            System.out.println("logout");
        } catch (Exception e) {
            return "redirect:/home";
        }

        return "redirect:/";
    }

    public String register(Model model, @RequestParam String name, @RequestParam String phone, @RequestParam String password) {
        UserInformation userinformation = new UserInformation();
        userinformation.setUsername(name);
        userinformation.setPhone(phone);
        userinformation.setModified(new Date());
        userinformation.setCreatedtime(new Date());
        if (userInformationService.insert(userinformation)==1) {
            int uid = userInformationService.selectIdByPhone(phone);
            UserPassword userPassword = new UserPassword();
            userPassword.setUid(uid);
            userPassword.setPassword(StringUtils.getInstance().getMD5(password));
            userPassword.setModified(new Date());

        }


    }
}
