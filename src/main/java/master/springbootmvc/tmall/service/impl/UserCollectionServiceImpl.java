package master.springbootmvc.tmall.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import master.springbootmvc.tmall.dao.UserCollectionDao;
import master.springbootmvc.tmall.model.UserCollection;
import master.springbootmvc.tmall.service.UserCollectionService;
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
public class UserCollectionServiceImpl implements UserCollectionService {

    @Resource
    private UserCollectionDao dao;
    @Override
    public int getCounts(int uid) {
        return dao.getCounts(uid);
    }

    @Override
    public List<UserCollection> selectByUid(int uid,int start) {
//        PageHelper.startPage(start);
//
//        Page<UserCollection> page = new Page<>();

        return dao.selectByUid(uid,start);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserCollection record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(UserCollection record) {
        return dao.insertSelective(record);
    }

    @Override
    public UserCollection selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserCollection record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserCollection record) {
        return dao.updateByPrimaryKey(record);
    }
}
