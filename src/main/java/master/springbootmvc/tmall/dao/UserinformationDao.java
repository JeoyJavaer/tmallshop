package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.UserInformation;

public interface UserinformationDao extends MyBatisBaseDao<UserInformation,Integer> {

    UserInformation selectUserByPhone(String phone);

}