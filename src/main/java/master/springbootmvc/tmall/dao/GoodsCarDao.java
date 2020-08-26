package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.GoodsCar;

import java.util.List;

public interface GoodsCarDao extends MyBatisBaseDao<GoodsCar,Integer> {

   List<GoodsCar> selectByUid(int uid);
}