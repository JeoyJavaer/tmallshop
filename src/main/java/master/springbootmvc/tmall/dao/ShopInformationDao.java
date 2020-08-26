package master.springbootmvc.tmall.dao;

import master.springbootmvc.tmall.base.MyBatisBaseDao;
import master.springbootmvc.tmall.model.ShopInformation;

import java.util.List;
import java.util.Map;

public interface ShopInformationDao extends MyBatisBaseDao<ShopInformation,Integer> {

    List<ShopInformation> selectTen(Map map);

    List<ShopInformation> selectOffShelf(Integer uid, Integer start);

    int getCountsOffShelf(Integer uid);

    int getCounts();

    int selectIdByImage(String image);

    List<ShopInformation> selectByName(String name);

    //通过分类选择
//    @Select("select * from shopinformation where sort=#{sort} and display =1 limit 12")
    List<ShopInformation> selectBySort(int sort);

    //选择用户的发布
//    @Select("select * from shopinformation where uid=#{uid} and display=1 order by id desc limit 12")
    List<ShopInformation> selectUserReleaseByUid(int uid);
}