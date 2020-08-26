package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.WantContext;

import java.util.List;

public interface WantContextDao  extends MyBatisBaseDao<WantContext,Integer> {

    List<WantContext>selectByUWid(int uwid,int start);

    int getCounts(int uid);
}