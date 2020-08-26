package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.base.BaseService;
import master.springbootmvc.tmall.model.Classfication;

import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/25
 * @since 1.0.0
 */
public interface ClassficationService extends BaseService<Classfication,Integer> {


    List<Classfication> selectByAid(int aid);
}
