package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.ShopPicture;

import java.util.List;


/**
 * ShopPictureDao继承基类
 */
public interface ShopPictureDao extends MyBatisBaseDao<ShopPicture, Integer> {
    ShopPicture selectBySidOnlyOne(Integer sid);

    List<ShopPicture>selectBySid(Integer sid);
}