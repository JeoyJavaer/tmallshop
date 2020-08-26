package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.Classfication;

import java.util.List;

public interface ClassficationDao  extends MyBatisBaseDao<Classfication,Integer> {
    List<Classfication>selectByAid(int aid);
}