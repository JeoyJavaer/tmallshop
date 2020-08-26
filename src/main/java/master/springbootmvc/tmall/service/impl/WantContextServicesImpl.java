package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.WantContextDao;
import master.springbootmvc.tmall.model.WantContext;
import master.springbootmvc.tmall.service.WantContextService;
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
public class WantContextServicesImpl implements WantContextService {
    @Resource
    private WantContextDao dao;

    @Override
    public List<WantContext> selectByUWid(int uwid, int start) {
        return dao.selectByUWid(uwid, start);
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
    public int insert(WantContext record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(WantContext record) {
        return dao.insertSelective(record);
    }

    @Override
    public WantContext selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(WantContext record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(WantContext record) {
        return dao.updateByPrimaryKey(record);
    }
}
