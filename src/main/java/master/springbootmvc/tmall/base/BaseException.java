package master.springbootmvc.tmall.base;

import lombok.Data;

/**
 * <br>〈功能简述〉<br>
 *
 * @author Administrator
 * @create 2020/8/21
 * @since 1.0.0
 */

public class BaseException extends RuntimeException {
    private  int code;
    private String msg;

    public BaseException(int code,String msg){
        super(msg);
        this.code=code;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
