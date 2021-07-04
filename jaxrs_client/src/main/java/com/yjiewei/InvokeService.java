package com.yjiewei;

import com.yjiewei.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;

/**
 * 调用rest服务的客户端
 * @author com.com.yjiewei
 * @date 2021/7/4
 */
public class InvokeService {

    public static void main(String[] args) {
        // 调用保存操作
        invokeSave();

        // 调用查询操作
        //invokeGet();
    }

    private static void invokeGet() {
        // 查询一个
        User user = WebClient
                        .create("http://localhost:8080/ws/userService/user/1")
                        .accept(MediaType.APPLICATION_JSON)
                        .get(User.class);
        System.out.println(user);
    }

    private static void invokeSave() {
        User user = new User();
        user.setId(100);
        user.setUserName("杨杰炜");
        user.setCity("广州");

        // 通过webclient对象来远程调用服务端
        /*
        1.创建访问连接
        2.请求参数类型 （这里用的是json，服务端可以接受json,xml）
        3.post请求，并传入参数
         */
        WebClient.create("http://localhost:8080/ws/userService/user")
                .type(MediaType.APPLICATION_JSON)
                .post(user);
    }
}
