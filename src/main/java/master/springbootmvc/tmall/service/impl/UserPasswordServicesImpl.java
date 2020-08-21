package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.UserPasswordDao;
import master.springbootmvc.tmall.model.UserPassword;
import master.springbootmvc.tmall.service.UserPasswordServices;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/21
 * @since 1.0.0
 */
public class UserPasswordServicesImpl implements UserPasswordServices {

    @Autowired
    private UserPasswordDao userPasswordDao;

    @Override
    public int insert(UserPassword record) {
        return userPasswordDao.insert(record);
    }

    @Override
    public int insertSelective(UserPassword record) {
        return userPasswordDao.insertSelective(record);
    }
}
