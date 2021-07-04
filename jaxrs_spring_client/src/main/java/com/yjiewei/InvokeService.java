package com.yjiewei;

import com.yjiewei.entity.User;
import org.apache.cxf.jaxrs.client.WebClient;

import javax.ws.rs.core.MediaType;

/**
 * 调用rest服务的客户端，这块内容和spring看起来并没有很大联系，比较的独立，只要有user,car就能封装返回结果了，我感觉
 * 知道访问路径，返回类型，再输出，如果没有返回类型是否能够接收，就像页面那些
 * @author com.com.yjiewei
 * @date 2021/7/4
 */
public class InvokeService {

    public static void main(String[] args) {
        // 调用保存操作
        invokeSave();

        // 调用查询操作
        invokeGet();

        // 调用删除操作
        invokeDelete();
    }

    private static void invokeDelete() {
        WebClient.create("http://localhost:8080/jaxrs_spring_server/ws/userService/user/100").delete();
    }

    private static void invokeGet() {
        // 查询一个
        User user = WebClient
                        .create("http://localhost:8080/jaxrs_spring_server/ws/userService/user/1")
                        .accept(MediaType.APPLICATION_JSON)
                        .get(User.class);
        System.out.println(user);

        WebClient webClient = WebClient
                .create("http://localhost:8080/jaxrs_spring_server/ws/userService/user/1")
                .accept(MediaType.APPLICATION_JSON);
        System.out.println(webClient);
        // 有输出一个对象，但是我不知道怎么用，怎么去封装返回结果。
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
        WebClient.create("http://localhost:8080/jaxrs_spring_server/ws/userService/user")
                /*.type(MediaType.APPLICATION_JSON)*/
                .post(user);
    }
}
