package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.Adminopreation;

public interface AdminopreationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Adminopreation record);

    int insertSelective(Adminopreation record);

    Adminopreation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Adminopreation record);

    int updateByPrimaryKey(Adminopreation record);
}