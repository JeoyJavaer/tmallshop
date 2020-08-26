package master.springbootmvc.tmall.service.impl;

import com.alibaba.druid.sql.dialect.odps.ast.OdpsAddStatisticStatement;
import master.springbootmvc.tmall.dao.GoodsOfOrderFormDao;
import master.springbootmvc.tmall.model.GoodsOfOrderForm;
import master.springbootmvc.tmall.service.GoodsOfOrderFormService;
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
public class GoodsOfOrderFormServiceImpl implements GoodsOfOrderFormService {

    @Resource
    private GoodsOfOrderFormDao dao;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(GoodsOfOrderForm record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(GoodsOfOrderForm record) {
        return dao.insertSelective(record);
    }

    @Override
    public GoodsOfOrderForm selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(GoodsOfOrderForm record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(GoodsOfOrderForm record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public List<GoodsOfOrderForm> selectByOfId(int ofId) {
        return dao.selectByOfId(ofId);
    }
}
