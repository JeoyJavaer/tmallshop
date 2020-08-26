package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.ShopCar;

import java.util.List;

public interface ShopCarDao {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopCar record);

    int insertSelective(ShopCar record);

    ShopCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShopCar record);

    int updateByPrimaryKey(ShopCar record);

    int getCounts(int uid);

    List<ShopCar> selectByUid(int uid);
}