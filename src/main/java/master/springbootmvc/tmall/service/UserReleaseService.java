package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.base.BaseService;
import master.springbootmvc.tmall.model.UserRelease;

import java.util.List;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/26
 * @since 1.0.0
 */
public interface UserReleaseService extends BaseService<UserRelease,Integer> {

    List<UserRelease> selectByUid(int uid, int start);

    int getCounts(int uid);
}
