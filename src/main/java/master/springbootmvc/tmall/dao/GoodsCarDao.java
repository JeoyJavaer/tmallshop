package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.GoodsCar;

import java.util.List;

public interface GoodsCarDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsCar record);

    int insertSelective(GoodsCar record);

    GoodsCar selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsCar record);

    int updateByPrimaryKey(GoodsCar record);

   List<GoodsCar> selectByUid(int uid);
}