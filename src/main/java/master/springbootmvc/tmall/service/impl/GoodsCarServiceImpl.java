package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.GoodsCarDao;
import master.springbootmvc.tmall.model.GoodsCar;
import master.springbootmvc.tmall.service.GoodsCarService;
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
public class GoodsCarServiceImpl implements GoodsCarService {

    @Resource
    GoodsCarDao dao;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GoodsCar record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(GoodsCar record) {
        return dao.insertSelective(record);
    }

    @Override
    public GoodsCar selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsCar record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsCar record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public List<GoodsCar> selectByUid(int uid) {
        return dao.selectByUid(uid);
    }
}
