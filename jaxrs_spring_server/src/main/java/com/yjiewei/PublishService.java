//package com.com.yjiewei;
//
//
//import org.apache.cxf.interceptor.LoggingInInterceptor;
//import org.apache.cxf.interceptor.LoggingOutInterceptor;
//import org.apache.cxf.jaxrs.JAXRSServerFactoryBean;
//import com.com.yjiewei.service.impl.UserServiceImpl;
//
///**
// * 当你整合了spring，通过web的方式来发布服务，就不需要这个手动发布服务了，你已经配置了
// * @author com.com.yjiewei
// * @date 2021/7/4
// */
//public class PublishService {
//    public static void main(String[] args) {
//        // 套路和之前的一样
//        // 1.创建发布服务的工厂
//        JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
//
//        // 2.设置服务地址
//        factory.setAddress("http://localhost:8080/ws");
//
//        // 3.设置服务类
//        factory.setServiceClass(UserServiceImpl.class);
//
//        // 4.添加日志输出输入拦截器
//        factory.getInInterceptors().add(new LoggingInInterceptor());
//        factory.getOutInterceptors().add(new LoggingOutInterceptor());
//
//        // 5.发布服务
//        factory.create();
//        System.out.println("UserService发布成功了，访问路径是http://localhost:8080/ws");
//
//    }
//}
