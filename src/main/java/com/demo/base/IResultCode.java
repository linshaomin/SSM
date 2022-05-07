package com.demo.base;

import java.io.Serializable;

/**
 * 业务代码接口
 *
 * @author linsm
 * @date 2022/3/22 17:39
 */
public interface IResultCode extends Serializable {

    /**
     * 获取消息
     *
     * @return
     */
    String getMessage();

    /**
     * 获取状态码
     *
     * @return
     */
    int getCode();

}
