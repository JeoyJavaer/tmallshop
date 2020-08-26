package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.OrderFormDao;
import master.springbootmvc.tmall.model.OrderForm;
import master.springbootmvc.tmall.service.OrderFormService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/26
 * @since 1.0.0
 */
@Service
public class OrderFormServiceImpl implements OrderFormService {

    @Resource
    private OrderFormDao dao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(OrderForm record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(OrderForm record) {
        return dao.insertSelective(record);
    }

    @Override
    public OrderForm selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(OrderForm record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(OrderForm record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public int getCounts(int uid) {
        return dao.getCounts(uid);
    }

    @Override
    public List<OrderForm> selectByUid(int uid) {
        return dao.selectByUid(uid);
    }
}
