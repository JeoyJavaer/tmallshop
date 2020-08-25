package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.AllkindsDao;
import master.springbootmvc.tmall.model.Allkinds;
import master.springbootmvc.tmall.service.AllKindsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/25
 * @since 1.0.0
 */
@Service
public class AllKindsServiceImpl implements AllKindsService {
    @Resource
    private AllkindsDao allkindsDao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return allkindsDao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Allkinds record) {
        return allkindsDao.insert(record);
    }

    @Override
    public int insertSelective(Allkinds record) {
        return allkindsDao.insertSelective(record);
    }

    @Override
    public Allkinds selectByPrimaryKey(Integer id) {
        return allkindsDao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Allkinds record) {
        return allkindsDao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Allkinds record) {
        return allkindsDao.updateByPrimaryKey(record);
    }

    @Override
    public List<Allkinds> selectAll() {
        return allkindsDao.selectAll();
    }
}
