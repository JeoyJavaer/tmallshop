package master.springbootmvc.tmall.base;

import master.springbootmvc.tmall.model.ShopCar;

import java.io.Serializable;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/26
 * @since 1.0.0
 */
public interface BaseDao <T, PK extends Serializable>{

    int deleteByPrimaryKey(PK id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);
}
