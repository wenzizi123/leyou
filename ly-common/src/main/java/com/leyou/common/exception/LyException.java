package com.leyou.common.exception;

import lombok.Getter;

/**
 * @program: leyou
 * @description: 自定义异常类，乐优项目中抛出的异常都为此异常，方便异常的统一处理。
 * @author: wudp
 * @create: 2022-05-05 15:40
 **/
@Getter
public class LyException extends RuntimeException {
    /**
     * 异常状态码信息
     */
    private int status;

    public LyException(int status) {
        this.status = status;
    }

    public LyException(int status, String message) {
        super(message);
        this.status = status;
    }

    public LyException(int status, String message, Throwable cause) {
        super(message, cause);
        this.status = status;
    }

    public LyException(int status, Throwable cause) {
        super(cause);
        this.status = status;
    }
}
