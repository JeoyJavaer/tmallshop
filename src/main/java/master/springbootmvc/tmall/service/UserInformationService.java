package master.springbootmvc.tmall.service;

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
public interface UserInformationService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInformation record);

    int insertSelective(UserInformation record);

    UserInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInformation record);

    int updateByPrimaryKey(UserInformation record);

    UserInformation selectUserByPhone(String phone);

    int selectIdByPhone(String phone);

    List<UserInformation> getAllForEach(List<Integer> list);

}
