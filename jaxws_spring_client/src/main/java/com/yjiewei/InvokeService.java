package com.yjiewei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 直接调用，这个应该可以不是一个web工程吧，直接有应用配置就可以
 * @author com.com.yjiewei
 * @date 2021/7/3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class InvokeService {

    // 注入远程访问服务端的接口代理对象
    @Resource
    private IHelloService helloService;

    @Test
    public void test(){
        System.out.println(helloService);
        System.out.println(helloService.getClass());

        // 调用服务接口
        String kyrie = helloService.sayHello("凯里欧文");
        System.out.println(kyrie);
    }
}
