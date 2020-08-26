package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.ShopPictureDao;
import master.springbootmvc.tmall.model.ShopPicture;
import master.springbootmvc.tmall.service.ShopPictureService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <br>〈商品图片服务〉<br>
 *
 * @author Administrator
 * @created 2020/8/26
 * @since 1.0.0
 */
@Service
public class ShopPictureServiceImpl implements ShopPictureService {
    @Resource
    private ShopPictureDao dao;

    @Override
    public ShopPicture selectBySidOnlyOne(Integer sid) {
        return dao.selectBySidOnlyOne(sid);
    }

    @Override
    public List<ShopPicture> selectBySid(Integer sid) {
        return dao.selectBySid(sid);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ShopPicture record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(ShopPicture record) {
        return dao.insertSelective(record);
    }

    @Override
    public ShopPicture selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShopPicture record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShopPicture record) {
        return dao.updateByPrimaryKey(record);
    }
}
