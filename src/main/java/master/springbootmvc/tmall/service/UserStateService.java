package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.base.BaseService;
import master.springbootmvc.tmall.model.UserRelease;
import master.springbootmvc.tmall.model.UserState;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/26
 * @since 1.0.0
 */
public interface UserStateService extends BaseService<UserState,Integer> {
    UserState selectByUid(int uid);

}
