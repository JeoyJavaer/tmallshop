package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.Admininformation;

public interface AdmininformationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Admininformation record);

    int insertSelective(Admininformation record);

    Admininformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Admininformation record);

    int updateByPrimaryKey(Admininformation record);
}