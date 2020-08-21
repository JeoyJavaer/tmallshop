package master.springbootmvc.tmall.aepect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * <br>〈单个用户登录〉<br>
 *
 * @author Administrator
 * @create 2020/8/21
 * @since 1.0.0
 */
@Aspect
public class OnlyOneUser {
    @Before(value = "execution(* master.springbootmvc.tmall.controller.UserController.login(..))")
    public void  isLogout(){

    }
}
