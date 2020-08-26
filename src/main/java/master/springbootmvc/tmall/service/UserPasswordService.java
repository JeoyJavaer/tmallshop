package master.springbootmvc.tmall.service;

import master.springbootmvc.tmall.base.BaseService;
import master.springbootmvc.tmall.model.UserPassword;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @created 2020/8/21
 * @since 1.0.0
 */
public interface UserPasswordService extends BaseService<UserPassword,Integer> {
    UserPassword selectByUid(Integer uid);
}
