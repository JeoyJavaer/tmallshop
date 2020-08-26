package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.Allkinds;

import java.util.List;

public interface AllkindsDao extends MyBatisBaseDao<Allkinds,Integer> {
    List<Allkinds> selectAll();
}