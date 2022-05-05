package com.leyou.gateway.fallback;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: leyou
 * @description: 失败交易的统一处理类
 * @author: wudp
 * @create: 2022-05-05 14:57
 **/
@RestController
public class FallbackController {

    /**
     * 默认的超时处理逻辑
     * @return 超时提醒
     */
    @RequestMapping(value = "/hystrix/fallback")
    public ResponseEntity<String> fallBackController() {
        return ResponseEntity.status(HttpStatus.GATEWAY_TIMEOUT).body("请求超时！");
    }
}
