package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.UserWant;

import java.util.List;

public interface UserWantDao  extends MyBatisBaseDao<UserWant,Integer> {

    List<UserWant>selectByUid(int uid,int start);
}