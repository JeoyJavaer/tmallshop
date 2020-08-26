package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.base.BaseService;
import master.springbootmvc.tmall.model.ShopInformation;

import java.util.List;
import java.util.Map;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/26
 * @since 1.0.0
 */
public interface ShopInformationService  extends BaseService<ShopInformation,Integer> {

    List<ShopInformation> selectTen(Map map);

    List<ShopInformation> selectOffShelf(Integer uid, Integer start);

    int getCountsOffShelf(Integer uid);

    int getCounts();

    int selectIdByImage(String image);

    List<ShopInformation> selectByName(String name);

    //通过分类选择
    List<ShopInformation> selectBySort(int sort);

    //选择用户的发布
    List<ShopInformation> selectUserReleaseByUid(int uid);
}
