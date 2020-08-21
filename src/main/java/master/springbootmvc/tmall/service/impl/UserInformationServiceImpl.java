package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.UserinformationDao;
import master.springbootmvc.tmall.model.UserInformation;
import master.springbootmvc.tmall.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <br> <br>
 *
 * @author Administrator
 * @create 2020/8/21
 * @since 1.0.0
 */
@Service
public class UserInformationServiceImpl implements UserInformationService {

    @Autowired
    private UserinformationDao userinformationDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userinformationDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserInformation record) {
        return userinformationDao.insert(record);
    }

    @Override
    public int insertSelective(UserInformation record) {
        return userinformationDao.insertSelective(record);
    }

    @Override
    public UserInformation selectByPrimaryKey(Integer id) {
        return userinformationDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserInformation record) {
        return userinformationDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserInformation record) {
        return userinformationDao.updateByPrimaryKey(record);
    }

    @Override
    public UserInformation selectUserByPhone(String phone) {
        return userinformationDao.selectUserByPhone(phone);
    }

    @Override
    public int selectIdByPhone(String phone) {
        return userinformationDao.selectUserByPhone(phone).getId();
    }

    @Override
    public List<UserInformation> getAllForEach(List<Integer> list) {
        ArrayList<UserInformation> informations = new ArrayList<>();
        for (Integer integer : list) {
            UserInformation userInformation = userinformationDao.selectByPrimaryKey(integer);
            informations.add(userInformation);
        }
        return informations;
    }
}
