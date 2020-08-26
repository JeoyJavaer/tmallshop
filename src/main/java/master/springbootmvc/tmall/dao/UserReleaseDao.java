package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.UserRelease;

import java.util.List;

public interface UserReleaseDao extends MyBatisBaseDao<UserRelease,Integer> {

    List<UserRelease>selectByUid(int uid,int start);

    int getCounts(int uid);
}