package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.Boughtshop;

import java.util.List;

public interface BoughtshopDao extends MyBatisBaseDao<Boughtshop,Integer> {

    List<Boughtshop>selectByUid(int uid,int state);
}