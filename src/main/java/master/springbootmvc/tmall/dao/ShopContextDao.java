package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.ShopContext;

import java.util.List;

/**
 * ShopContextDao继承基类
 */
public interface ShopContextDao extends MyBatisBaseDao<ShopContext, Integer> {

    int getCounts(int sid);

    List<ShopContext> findById(int sid,int start);

    List<ShopContext> selectBySid(int sid);
}