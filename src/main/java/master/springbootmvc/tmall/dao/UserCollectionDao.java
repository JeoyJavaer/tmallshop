package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.UserCollection;

import java.util.List;

public interface UserCollectionDao  extends MyBatisBaseDao<UserCollection,Integer> {

    List<UserCollection> selectByUid(Integer uid,int start);
    int getCounts(int uid);
}