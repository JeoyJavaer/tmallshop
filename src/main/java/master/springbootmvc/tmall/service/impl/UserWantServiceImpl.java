package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.UserWantDao;
import master.springbootmvc.tmall.model.UserWant;
import master.springbootmvc.tmall.service.UserWantService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/26
 * @since 1.0.0
 */
@Service
public class UserWantServiceImpl implements UserWantService {

    @Resource
    private UserWantDao dao;

    @Override
    public List<UserWant> selectByUid(int uid, int start) {
        return dao.selectByUid(uid,start);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserWant record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(UserWant record) {
        return dao.insertSelective(record);
    }

    @Override
    public UserWant selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserWant record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserWant record) {
        return dao.updateByPrimaryKey(record);
    }
}
