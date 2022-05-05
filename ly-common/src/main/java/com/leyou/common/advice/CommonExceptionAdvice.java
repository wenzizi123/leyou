package com.leyou.common.advice;

import com.leyou.common.exception.LyException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @program: leyou
 * @description: 统一异常处理类
 * @author: wudp
 * @create: 2022-05-05 15:34
 **/
@ControllerAdvice
public class CommonExceptionAdvice {

    /**
     * 统一异常处理方法，@ExceptionHandler(LyException.class)声明这个方法处理LyException这样的异常。注意，在本项目中，抛出的异常应都为LyException
     * @param e 捕获到的异常
     * @return 返回给页面的状态码和信息
     */
    @ExceptionHandler(LyException.class)
    public ResponseEntity<String> handleLyException(LyException e) {
        return ResponseEntity.status(e.getStatus()).body(e.getMessage());
    }
}
