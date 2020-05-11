package com.youfei.dppsconsumer.action;

import com.alibaba.dubbo.config.annotation.Reference;

import com.youfei.dppsprovider.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author songjinping
 * @param
 */
@RestController
public class TestController {
    //注入服务方提供的接口
    @Reference
    TestService testService;

    @GetMapping("/Test/hello")
    public ResponseEntity TestHello(){

        System.out.print("+++++++++++++++++++++++++++++++++++");
        //调用服务提供者接口方法
        String a = testService.sayHello("小明");

        return ResponseEntity.ok(a);
    }





}
