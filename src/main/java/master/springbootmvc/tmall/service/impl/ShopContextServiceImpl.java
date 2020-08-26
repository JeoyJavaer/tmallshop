package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.ShopCarDao;
import master.springbootmvc.tmall.dao.ShopContextDao;
import master.springbootmvc.tmall.model.ShopContext;
import master.springbootmvc.tmall.service.ShopContextService;
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
public class ShopContextServiceImpl implements ShopContextService {
    @Resource
    private ShopContextDao dao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ShopContext record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(ShopContext record) {
        return dao.insertSelective(record);
    }

    @Override
    public ShopContext selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShopContext record) {
        return updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShopContext record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public int getCounts(int sid) {
        return dao.getCounts(sid);
    }

    @Override
    public List<ShopContext> findById(int sid, int start) {
        return dao.findById(sid,start);
    }

    @Override
    public List<ShopContext> selectBySid(int sid) {
        return dao.selectBySid(sid);
    }
}
