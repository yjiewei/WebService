package com.yjiewei.service;


import com.yjiewei.entity.User;

import javax.ws.rs.*;
import java.util.List;

/**
 * 增删改查 注意请求方法的切换
 * consumes表示请求参数类型格式，produces表示返回的数据类型
 * @author com.com.yjiewei
 * @date 2021/7/4
 */
@Produces("*/*") // 服务器支持的返回数据类型
public interface UserService {

    // 表示处理的请求的类型，post 对应的是insert新增操作
    @POST
    // 访问当前服务接口方法对应的路径。 【.../userService/user】
    @Path("/user")
    // 服务器支持的请求的数据格式类型
    @Consumes({ "application/xml", "application/json" })
    public void saveUser(User user);

    @PUT
    @Path("/user")
    @Consumes({"application/xml", "application/json"})
    public void updateUser(User user);


    @GET
    @Path("/user/{id}")
    @Consumes({"application/xml"})
    // @Produces({"application/json"}) // {"User":{"city":"广州","id":1,"userName":"杨杰炜"}}
    /*
    <User>
        <city>广州</city>
        <id>1</id>
        <userName>杨杰炜</userName>
    </User>
    */
    @Produces({"application/json", "application/xml"})
    public User getUserById(@PathParam("id") Integer id);

    @GET
    @Path("/user")
    @Produces({"application/xml", "application/json"})
    public List<User> getAllUser();

    @DELETE
    @Path("/user/{id}")
    @Consumes({"application/xml", "application/json"})
    public void deleteUser(@PathParam("id") Integer id);

}
