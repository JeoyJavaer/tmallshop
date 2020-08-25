package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.model.Allkinds;

import java.util.List;

public interface AllkindsDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Allkinds record);

    int insertSelective(Allkinds record);

    Allkinds selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Allkinds record);

    int updateByPrimaryKey(Allkinds record);

    List<Allkinds> selectAll();
}