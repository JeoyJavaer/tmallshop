package master.springbootmvc.tmall.controller;

import master.springbootmvc.tmall.base.BaseResponse;
import master.springbootmvc.tmall.model.UserInformation;
import master.springbootmvc.tmall.model.UserPassword;
import master.springbootmvc.tmall.service.UserInformationService;
import master.springbootmvc.tmall.service.UserPasswordService;
import master.springbootmvc.tmall.utils.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * <br>〈注册用户〉<br>
 *
 * @author Administrator
 * @created 2020/8/25
 * @since 1.0.0
 */
@RestController
public class RegisterController {

    @Resource
    private UserInformationService userInformationService;

    @Resource
    private UserPasswordService userPasswordServices;

    @RequestMapping("/insertUser")
    public BaseResponse insertUser(HttpServletRequest request, @RequestParam String password, @RequestParam String token) {
        String userPhone = (String) request.getSession().getAttribute("phone");
        String userToken = (String) request.getSession().getAttribute("token");
        // 检查token是否一致或者为空

        //查询手机号是否已经存在
        int uid = userInformationService.selectIdByPhone(userPhone);
        if (0 != uid) {
            return BaseResponse.fail("手机号已经注册");
        }

        UserInformation userInformation = new UserInformation();
        userInformation.setPhone(userPhone);

        String username = (String) request.getSession().getAttribute("name");
        userInformation.setUsername(username);
        userInformation.setCreatedtime(new Date());
        userInformation.setModified(new Date());

        int result = userInformationService.insertSelective(userInformation);
        if (1 == result) {//用户创建成功
            //插入到用户密码表中
            int userId = userInformationService.selectIdByPhone(userPhone);
            UserPassword userPassword = new UserPassword();
            userPassword.setUid(userId);
            userPassword.setModified(new Date());
            userPassword.setPassword(StringUtils.getInstance().getMD5(password));
            int i = userPasswordServices.insertSelective(userPassword);
            if (i != 1) {//密码表插入失败
                userInformationService.deleteByPrimaryKey(userId);
                return BaseResponse.fail("注册失败");
            } else {
                UserInformation userInformation1 = userInformationService.selectByPrimaryKey(userId);
                request.getSession().setAttribute("userInformation", userInformation1);
                return BaseResponse.success("注册会员成功", userInformation1);
            }
        } else {
            return BaseResponse.fail("注册失败");
        }

    }
}
