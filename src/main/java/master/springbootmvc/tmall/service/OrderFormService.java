package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.base.BaseService;
import master.springbootmvc.tmall.model.OrderForm;

import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/26
 * @since 1.0.0
 */
public interface OrderFormService extends BaseService<OrderForm,Integer> {

    int getCounts(int uid);

    List<OrderForm> selectByUid(int uid);

}
