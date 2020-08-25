package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.model.Allkinds;

import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/25
 * @since 1.0.0
 */
public interface AllKindsService {

    int deleteByPrimaryKey(Integer id);

    int insert(Allkinds record);

    int insertSelective(Allkinds record);

    Allkinds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Allkinds record);

    int updateByPrimaryKey(Allkinds record);

    List<Allkinds>selectAll();
}
