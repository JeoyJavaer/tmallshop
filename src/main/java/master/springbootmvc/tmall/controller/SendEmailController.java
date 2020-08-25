package master.springbootmvc.tmall.controller;

import com.sun.scenario.effect.impl.prism.PrReflectionPeer;
import master.springbootmvc.tmall.base.BaseResponse;
import master.springbootmvc.tmall.model.UserInformation;
import master.springbootmvc.tmall.service.UserInformationService;
import master.springbootmvc.tmall.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Properties;
import java.util.Random;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/25
 * @since 1.0.0
 */
@RestController
public class SendEmailController {

    @Autowired
    private UserInformationService userInformationService;

    @RequestMapping(value = "sendCode", method = {RequestMethod.POST, RequestMethod.GET})
    private BaseResponse sendCode(HttpServletRequest request, HttpServletResponse response, @RequestParam String token, @RequestParam String phone, @RequestParam String action) {
        response.setContentType("text/html;charset=UTF-8");
        String sessionToken = (String) request.getSession().getAttribute("token");
//        if (StringUtils.isEmpty(sessionToken) || sessionToken.equals(token)) {
//            return BaseResponse.fail();
//        }
        if (!StringUtils.getInstance().isPhone(phone)) {
            return BaseResponse.fail("手机号码错误");
        }
        if ("forget".equals(action)) {
            if (!isUserPhoneExists(phone)) {
                return BaseResponse.fail("手机号码未注册");
            }
        } else if ("register".equals(action)) {
            if (isUserPhoneExists(phone)) {
                return BaseResponse.fail();
            }
        }

        String codePhone = getRandomForCodePhone();
        request.getSession().setAttribute("codePhone", codePhone);
        String text1 = "【WSK的验证码】您的验证码是：";
        String text2 = "，请保护好自己的验证码。";

        String text = text1 + codePhone + text2;
//        Properties properties = new Properties();
//        properties.setProperty("mail.host", "smtp.139.com");
//        properties.setProperty("mail.transport.protocol", "smtp");
//        properties.setProperty("mail.smtp.auth", "true");
//        properties.setProperty("mail.smtp.port", "25");
        try {
            String realPhone = phone;
            //TODO  发送短信的操作
            request.getSession().setAttribute("phone",realPhone);
            return  BaseResponse.success("验证码发送成功",codePhone);
        } catch (Exception e) {
            e.printStackTrace();
            return  BaseResponse.fail();
        }
    }


    private  String getRandomForCodePhone(){
        Random random = new Random();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < 4; i++) {
            buffer.append(random.nextInt(10));

        }
        System.out.println(buffer.toString());
        return buffer.toString();
    }

    private boolean isUserPhoneExists(String phone) {
        boolean result = false;
        try {
            int i = userInformationService.selectIdByPhone(phone);
            if (i == 0) {
                return false;
            }

            UserInformation userInformation = userInformationService.selectByPrimaryKey(i);
            if (StringUtils.getInstance().isNullOrEmpty(userInformation)) {
                return false;
            }
            String userPhone = userInformation.getPhone();
            result = !StringUtils.isEmpty(userPhone);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return result;
    }

}
