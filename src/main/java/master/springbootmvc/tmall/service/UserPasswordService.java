package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.model.UserPassword;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/21
 * @since 1.0.0
 */
public interface UserPasswordService {

    int deleteByPrimaryKey(Integer id);

    int insert(UserPassword record);

    int insertSelective(UserPassword record);

    UserPassword selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPassword record);

    int updateByPrimaryKey(UserPassword record);


    UserPassword selectByUid(Integer uid);


}
