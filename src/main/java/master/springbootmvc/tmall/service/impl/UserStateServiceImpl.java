package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.UserStateDao;
import master.springbootmvc.tmall.model.UserState;
import master.springbootmvc.tmall.service.UserStateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/26
 * @since 1.0.0
 */
@Service
public class UserStateServiceImpl implements UserStateService {
    @Resource
    private UserStateDao dao;

    @Override
    public UserState selectByUid(int uid) {
        return dao.selectByUid(uid);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserState record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(UserState record) {
        return dao.insertSelective(record);
    }

    @Override
    public UserState selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserState record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserState record) {
        return dao.updateByPrimaryKey(record);
    }
}
