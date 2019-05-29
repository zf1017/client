package com.example.eurekaclent;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zf1017@foxmail.com
 * @date 2019/5/16 0016 14:25
 * @description
 */
@RestController
@Slf4j
public class DemoController {
    /**
     * @description: TODO
     * @param
     * @return
     * @author zf1017@foxmail.com
     * @date 2019/5/16 0016 15:59
     */
    @RequestMapping("/hello")
    public Object hello(){
        return "hello client";
    }

    @RequestMapping("/timeOut")
    public String timeOut(@RequestParam int mills) {
        long l = System.currentTimeMillis();
//        log.info("[client服务-{}] [timeOut方法]收到请求,阻塞{}ms", mills);
        System.out.println(1017);
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        /*System.out.println("time:"+(end-l));*/
//        log.info("[client服务-{}] [timeOut]返回请求");
        return String.format("client服务 请求ok!!!");
    }

}
