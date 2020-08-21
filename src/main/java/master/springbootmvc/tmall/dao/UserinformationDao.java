package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.UserInformation;

import java.util.List;

public interface UserinformationDao {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInformation record);

    int insertSelective(UserInformation record);

    UserInformation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserInformation record);

    int updateByPrimaryKey(UserInformation record);

    UserInformation selectUserByPhone(String phone);

}