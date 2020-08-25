package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.model.Classfication;

import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/25
 * @since 1.0.0
 */
public interface ClassficationService {

    int deleteByPrimaryKey(Integer id);

    int insert(Classfication record);

    int insertSelective(Classfication record);

    Classfication selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Classfication record);

    int updateByPrimaryKey(Classfication record);

    List<Classfication> selectByAid(int aid);
}
