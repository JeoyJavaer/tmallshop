package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.UserPassword;

public interface UserPasswordDao extends MyBatisBaseDao<UserPassword, Integer> {
    UserPassword selectByUid(Integer uid);
}