package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.ShopInformationDao;
import master.springbootmvc.tmall.model.ShopInformation;
import master.springbootmvc.tmall.service.ShopInformationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/26
 * @since 1.0.0
 */

@Service
public class ShopInformationServiceImpl  implements ShopInformationService {
    @Resource
    private ShopInformationDao dao;

    @Override
    public List<ShopInformation> selectTen(Map map) {
        return dao.selectTen(map);
    }

    @Override
    public List<ShopInformation> selectOffShelf(Integer uid, Integer start) {
        return dao.selectOffShelf(uid, start);
    }

    @Override
    public int getCountsOffShelf(Integer uid) {
        return dao.getCountsOffShelf(uid);
    }

    @Override
    public int getCounts() {
        return dao.getCounts();
    }

    @Override
    public int selectIdByImage(String image) {
        return dao.selectIdByImage(image);
    }

    @Override
    public List<ShopInformation> selectByName(String name) {
        return dao.selectByName(name);
    }

    @Override
    public List<ShopInformation> selectBySort(int sort) {
        return dao.selectBySort(sort);
    }

    @Override
    public List<ShopInformation> selectUserReleaseByUid(int uid) {
        return dao.selectUserReleaseByUid(uid);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ShopInformation record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(ShopInformation record) {
        return dao.insertSelective(record);
    }

    @Override
    public ShopInformation selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(ShopInformation record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShopInformation record) {
        return dao.updateByPrimaryKey(record);
    }
}
