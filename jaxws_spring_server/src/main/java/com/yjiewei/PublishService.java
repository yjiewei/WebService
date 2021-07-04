package com.yjiewei;

import com.yjiewei.impl.HelloServiceImpl;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * 发布服务，这里的手动配置，改为配置文件，启动tomcat就是发布服务了
 * @author com.com.yjiewei
 * @date 2021/7/3
 */
public class PublishService {
    public static void main(String[] args) {
        // 1.服务工厂
        JaxWsServerFactoryBean wsFactory = new JaxWsServerFactoryBean();

        // 2.设置服务地址
        wsFactory.setAddress("http://localhost:8080/user");

        // 3.设置服务类
        wsFactory.setServiceBean(new HelloServiceImpl());

        //  添加日志输入、输出拦截器，观察soap请求、soap响应内容
        wsFactory.getInInterceptors().add(new LoggingInInterceptor());
        wsFactory.getOutInterceptors().add(new LoggingOutInterceptor());

        // 4.发布服务
        wsFactory.create();

        // 5.控制台提示
        System.out.println("服务发布成功");
    }
}
