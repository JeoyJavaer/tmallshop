package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.UserPasswordDao;
import master.springbootmvc.tmall.model.UserPassword;
import master.springbootmvc.tmall.service.UserPasswordServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/21
 * @since 1.0.0
 */
@Service
public class UserPasswordServicesImpl implements UserPasswordServices {

    @Autowired
    private UserPasswordDao userPasswordDao;


    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userPasswordDao.deleteByPrimaryKey(id);
    }

    public int insert(UserPassword record) {
        return userPasswordDao.insert(record);
    }

    @Override
    public int insertSelective(UserPassword record) {
        return userPasswordDao.insertSelective(record);
    }

    @Override
    public UserPassword selectByPrimaryKey(Integer id) {
        return userPasswordDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserPassword record) {
        return userPasswordDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserPassword record) {
        return userPasswordDao.updateByPrimaryKey(record);
    }

    @Override
    public UserPassword selectByUid(Integer uid) {
        return userPasswordDao.selectByUid(uid);
    }
}
