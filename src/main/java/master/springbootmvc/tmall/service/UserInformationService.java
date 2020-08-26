package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.base.BaseService;
import master.springbootmvc.tmall.model.UserInformation;
import org.apache.catalina.User;

import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/21
 * @since 1.0.0
 */
public interface UserInformationService extends BaseService<UserInformation,Integer> {


    UserInformation selectUserByPhone(String phone);

    int selectIdByPhone(String phone);

    List<UserInformation> getAllForEach(List<Integer> list);

}
