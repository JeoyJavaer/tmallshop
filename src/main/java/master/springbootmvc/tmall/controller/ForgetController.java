package master.springbootmvc.tmall.controller;

import master.springbootmvc.tmall.base.BaseResponse;
import master.springbootmvc.tmall.model.UserInformation;
import master.springbootmvc.tmall.model.UserPassword;
import master.springbootmvc.tmall.service.UserInformationService;
import master.springbootmvc.tmall.service.UserPasswordService;
import master.springbootmvc.tmall.utils.StringUtils;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/24
 * @since 1.0.0
 */
@RestController
public class ForgetController {

    @Resource
    private UserPasswordService userPasswordServices;
    @Resource
    private UserInformationService userInformationService;

    @RequestMapping("checkCode")
    public  BaseResponse checkPhone(HttpServletRequest request, Model model, @RequestParam String code, @RequestParam String token) {

        String name = request.getParameter("name");
        if (StringUtils.getInstance().isNullOrEmpty(name)) {
            request.getSession().setAttribute("name", name);
        }
//        String localToken = (String) request.getSession().getAttribute("token");
//        if (StringUtils.isEmpty(localToken) || localToken.equals(token)) {
//            map.put("result", 0);
//            return map;
//        }
        if (!checkCodePhone(code, request)) {
            return BaseResponse.fail();
        }
        return BaseResponse.success("验证码正确");
    }


    @RequestMapping("updatePassword")
    public BaseResponse updatePassword(HttpServletRequest request, Model model, @RequestParam String password, @RequestParam String token) {
        String sessionToken = (String) request.getSession().getAttribute("token");
        if (StringUtils.getInstance().isNullOrEmpty(sessionToken) || !sessionToken.equals(token)) {
            return BaseResponse.fail();
        }
        String sessionPhone = (String) request.getSession().getAttribute("phone");
        UserPassword userPassword = new UserPassword();
        userPassword.setPassword(StringUtils.getInstance().getMD5(password));
        int uid;
        try {
            uid = userInformationService.selectIdByPhone(sessionPhone);
            if (uid == 0) {
                return BaseResponse.fail();
            }
        } catch (Exception e) {
            e.printStackTrace();
            return  BaseResponse.fail();
        }
        userPassword.setUid(uid);
        Integer id = userPasswordServices.selectByUid(uid).getId();
        userPassword.setId(id);
        userPassword.setModified(new Date());
        int result;
        try {
            result = userPasswordServices.updateByPrimaryKeySelective(userPassword);
        } catch (Exception e) {
            return  BaseResponse.fail();
        }
        if (result != 1) {
            return BaseResponse.fail();
        }
        UserInformation userInformation = userInformationService.selectByPrimaryKey(uid);
        request.getSession().setAttribute("userInformation", userInformation);
        return BaseResponse.success();
    }

    private boolean checkCodePhone(String phone, HttpServletRequest request) {
        String codePhone = (String) request.getSession().getAttribute("codePhone");
        return phone.equals(codePhone);
    }


}
