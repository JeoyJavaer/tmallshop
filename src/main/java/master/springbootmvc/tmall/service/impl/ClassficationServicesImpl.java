package master.springbootmvc.tmall.service.impl;

import master.springbootmvc.tmall.dao.ClassficationDao;
import master.springbootmvc.tmall.model.Classfication;
import master.springbootmvc.tmall.service.ClassficationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <br>〈商品二级分类〉<br>
 *
 * @author Administrator
 * @created 2020/8/25
 * @since 1.0.0
 */
@Service
public class ClassficationServicesImpl implements ClassficationService {

    @Resource
    private ClassficationDao dao;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return dao.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Classfication record) {
        return dao.insert(record);
    }

    @Override
    public int insertSelective(Classfication record) {
        return dao.insertSelective(record);
    }

    @Override
    public Classfication selectByPrimaryKey(Integer id) {
        return dao.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Classfication record) {
        return dao.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Classfication record) {
        return dao.updateByPrimaryKey(record);
    }

    @Override
    public List<Classfication> selectByAid(int aid) {
        return dao.selectByAid(aid);
    }
}
