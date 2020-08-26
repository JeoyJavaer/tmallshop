package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.GoodsOfOrderForm;

import java.util.List;

public interface GoodsOfOrderFormDao {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsOfOrderForm record);

    int insertSelective(GoodsOfOrderForm record);

    GoodsOfOrderForm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsOfOrderForm record);

    int updateByPrimaryKey(GoodsOfOrderForm record);

    List<GoodsOfOrderForm> selectByOfId(int ofId);
}