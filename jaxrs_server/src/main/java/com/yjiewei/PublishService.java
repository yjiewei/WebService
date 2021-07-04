package com.yjiewei;

import com.yjiewei.service.impl.UserServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;

/**
 * @author com.com.yjiewei
 * @date 2021/7/4
 */
public class PublishService {
    public static void main(String[] args) {
        // 套路和之前的一样
        // 1.创建发布服务的工厂
        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();

        // 2.设置服务地址
        factory.setAddress("http://localhost:8080/ws");

        // 3.设置服务类
        factory.setServiceClass(UserServiceImpl.class);

        // 4.添加日志输出输入拦截器
        factory.getInInterceptors().add(new LoggingInInterceptor());
        factory.getOutInterceptors().add(new LoggingOutInterceptor());

        // 5.发布服务
        factory.create();
        System.out.println("UserService发布成功了，访问路径是http://localhost:8080/ws");

    }
}
