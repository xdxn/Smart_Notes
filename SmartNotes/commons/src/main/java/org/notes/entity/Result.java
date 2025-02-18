package org.notes.entity;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: xc
 * @Description: TODO
 * @Date: 2025/2/18 9:57
 * @Version: 1.0
 */
@Data
@AllArgsConstructor
public class Result<T> implements Serializable {

    private boolean flag; //编码：true成功，false为失败
    private String msg; //错误信息
    private T data; //数据
    private int code; //状态码

    public Result(boolean flag, String msg, T data){
        this.flag = flag;
        this.msg = msg;
        this.data = data;
    }

    public Result() {

    }
}
