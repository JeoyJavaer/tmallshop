package master.springbootmvc.tmall.controller;

import master.springbootmvc.tmall.service.UserInformationService;
import master.springbootmvc.tmall.service.UserPasswordServices;
import master.springbootmvc.tmall.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/24
 * @since 1.0.0
 */
@RestController
public class ForgetController {

    @Autowired
    private UserPasswordServices userPasswordServices;
    @Autowired
    private UserInformationService userInformationService;

    @RequestMapping("checkCode")
    public Map checkPhone(HttpServletRequest request, Model model, @RequestParam String code, @RequestParam String token) {

        HashMap<String, Integer> map = new HashMap<>();

        String name = request.getParameter("name");
        if (StringUtils.getInstance().isNullOrEmpty(name)) {
            request.getSession().setAttribute("name", name);
        }
        String localToken = (String) request.getSession().getAttribute("token");
        if (StringUtils.isEmpty(localToken) || localToken.equals(token)) {
            map.put("result", 0);
            return map;
        }
        if (!checkCodePhone(code, request)) {
            map.put("result", 0);
            return map;
        }
        map.put("result", 1);
        return map;
    }

    private boolean checkCodePhone(String phone, HttpServletRequest request) {
        String trueCodePhone = "12345678";
        return phone.equals(trueCodePhone);
    }


}
