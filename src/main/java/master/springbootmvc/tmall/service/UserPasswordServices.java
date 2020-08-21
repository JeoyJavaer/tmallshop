package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.model.UserPassword;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/21
 * @since 1.0.0
 */
public interface UserPasswordServices {

    int insert(UserPassword record);

    int insertSelective(UserPassword record);

}
