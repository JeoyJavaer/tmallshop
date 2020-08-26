package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.UserReleaseDao;
import master.springbootmvc.tmall.model.UserRelease;
import master.springbootmvc.tmall.service.UserReleaseService;
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
public class UserReleaseServiceImpl implements UserReleaseService {
    @Resource
    private UserReleaseDao dao;

    @Override
    public List<UserRelease> selectByUid(int uid, int start) {
        return dao.selectByUid(uid, start);
    }

    @Override
    public int getCounts(int uid) {
        return dao.getCounts(uid);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserRelease record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(UserRelease record) {
        return dao.insertSelective(record);
    }

    @Override
    public UserRelease selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserRelease record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserRelease record) {
        return dao.updateByPrimaryKey(record);
    }
}
