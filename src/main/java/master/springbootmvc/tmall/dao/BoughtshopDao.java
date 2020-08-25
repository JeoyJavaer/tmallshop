package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.Boughtshop;

import java.util.List;

public interface BoughtshopDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Boughtshop record);

    int insertSelective(Boughtshop record);

    Boughtshop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Boughtshop record);

    int updateByPrimaryKey(Boughtshop record);

    List<Boughtshop>selectByUid(int uid,int state);
}