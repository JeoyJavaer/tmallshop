package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.UserPassword;

public interface UserPasswordDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserPassword record);

    int insertSelective(UserPassword record);

    UserPassword selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserPassword record);

    int updateByPrimaryKey(UserPassword record);
    UserPassword selectByUid(Integer uid);
}