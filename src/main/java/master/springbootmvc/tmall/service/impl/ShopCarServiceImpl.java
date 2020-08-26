package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.ShopCarDao;
import master.springbootmvc.tmall.model.ShopCar;
import master.springbootmvc.tmall.service.ShopCarService;

import javax.annotation.Resource;
import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/26
 * @since 1.0.0
 */
public class ShopCarServiceImpl implements ShopCarService {

    @Resource
    private ShopCarDao dao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ShopCar record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(ShopCar record) {
        return dao.insertSelective(record);
    }

    @Override
    public ShopCar selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShopCar record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShopCar record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public int getCounts(int uid) {
        return dao.getCounts(uid);
    }

    @Override
    public List<ShopCar> selectByUid(int uid) {
        return dao.selectByUid(uid);
    }
}
