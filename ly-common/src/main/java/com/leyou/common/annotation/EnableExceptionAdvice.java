package com.leyou.common.annotation;

import com.leyou.common.advice.CommonExceptionAdvice;
import com.leyou.common.advice.CommonLogAdvice;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @program: leyou
 * @description: 开启统一异常处理类，统一日志处理类的注解
 * @author: wudp
 * @create: 2022-05-05 15:37
 **/
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({CommonExceptionAdvice.class, CommonLogAdvice.class})
public @interface EnableExceptionAdvice {
}
