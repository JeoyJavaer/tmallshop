package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.UserPassword;

public interface UserPasswordDao {
    int insert(UserPassword record);

    int insertSelective(UserPassword record);
}