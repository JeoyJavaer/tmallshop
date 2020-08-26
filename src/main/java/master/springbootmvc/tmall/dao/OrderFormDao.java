package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.OrderForm;

import java.util.List;

public interface OrderFormDao {
    int deleteByPrimaryKey(Integer id);

    int insert(OrderForm record);

    int insertSelective(OrderForm record);

    OrderForm selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(OrderForm record);

    int updateByPrimaryKey(OrderForm record);

    int getCounts(int uid);

     List<OrderForm>selectByUid(int uid);
}