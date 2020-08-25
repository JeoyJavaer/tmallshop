package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.BoughtshopDao;
import master.springbootmvc.tmall.model.Boughtshop;
import master.springbootmvc.tmall.service.BoughtShopService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/25
 * @since 1.0.0
 */
@Service
public class BoughtShopServiceImpl implements BoughtShopService {
    private BoughtshopDao dao;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Boughtshop record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(Boughtshop record) {
        return dao.insertSelective(record);
    }

    @Override
    public Boughtshop selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Boughtshop record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Boughtshop record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public List<Boughtshop> selectByUid(int uid, int start) {
        return dao.selectByUid(uid,start);
    }
}
