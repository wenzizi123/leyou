package com.leyou.item;

import com.leyou.common.annotation.EnableExceptionAdvice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @program: leyou
 * @description: 商品微服务启动类
 * @author: wudp
 * @create: 2022-05-05 15:23
 **/
@SpringBootApplication
@EnableExceptionAdvice
public class LyItemApplication {
    public static void main(String[] args) {
        SpringApplication.run(LyItemApplication.class, args);
    }
}
