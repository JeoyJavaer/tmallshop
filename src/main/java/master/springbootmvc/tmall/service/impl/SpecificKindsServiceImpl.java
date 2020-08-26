package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.SpecificKindsDao;
import master.springbootmvc.tmall.model.SpecificKinds;
import master.springbootmvc.tmall.service.SpecificKindsService;
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
public class SpecificKindsServiceImpl implements SpecificKindsService {

    @Resource
    private SpecificKindsDao dao;

    @Override
    public List<SpecificKinds> selectByCid(Integer cid) {
        return dao.selectByCid(cid);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(SpecificKinds record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(SpecificKinds record) {
        return dao.insertSelective(record);
    }

    @Override
    public SpecificKinds selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(SpecificKinds record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SpecificKinds record) {
        return dao.updateByPrimaryKey(record);
    }
}
