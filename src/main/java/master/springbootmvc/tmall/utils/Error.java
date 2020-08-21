package master.springbootmvc.tmall.utils;

import lombok.Data;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/21
 * @since 1.0.0
 */
@Data
public class Error {
    private int log_id;
    private int error_code;
    private  String error_msg;

}
