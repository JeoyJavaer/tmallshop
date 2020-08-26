package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.SpecificKinds;

import java.util.List;

public interface SpecificKindsDao extends MyBatisBaseDao<SpecificKinds,Integer> {

    List<SpecificKinds>selectByCid(Integer cid);
}