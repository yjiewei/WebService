package com.yjiewei;

import org.apache.cxf.jaxws.JaxWsClientFactoryBean;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

/**
 * 调用服务
 * @author com.com.yjiewei
 * @date 2021/7/3
 */
public class InvokeService {

    public static void main(String[] args) {
        // 服务地址 http://localhost:8080/user
        // 1.创建cxf代理工厂
        JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

        // 2.设置远程访问服务端地址
        factory.setAddress("http://localhost:8080/user");

        // 3.设置接口类型（得本地写上）
        factory.setServiceClass(IHelloService.class);

        // 4.对接口生成代理对象
        IHelloService helloService = factory.create(IHelloService.class);

        // 5.远程访问服务端方法
        String returnValue = helloService.sayHello("杨杰炜");

        System.out.println("服务端的返回值是：" + returnValue);

    }
}
