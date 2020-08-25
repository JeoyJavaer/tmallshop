package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.Classfication;

import java.util.List;

public interface ClassficationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Classfication record);

    int insertSelective(Classfication record);

    Classfication selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classfication record);

    int updateByPrimaryKey(Classfication record);

    List<Classfication>selectByAid(int aid);

}