package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.base.BaseService;
import master.springbootmvc.tmall.model.ShopContext;

import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/26
 * @since 1.0.0
 */
public interface ShopContextService extends BaseService<ShopContext,Integer> {

    int getCounts(int sid);

    List<ShopContext> findById(int sid, int start);

    List<ShopContext> selectBySid(int sid);
}
