package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.UserRelease;
import master.springbootmvc.tmall.model.UserState;

public interface UserStateDao extends MyBatisBaseDao<UserState,Integer> {

    UserState selectByUid(int uid);
}