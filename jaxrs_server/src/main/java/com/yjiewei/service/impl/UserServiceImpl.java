package com.yjiewei.service.impl;

import com.yjiewei.entity.Car;
import com.yjiewei.entity.User;
import com.yjiewei.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author com.com.yjiewei
 * @date 2021/7/4
 */
public class UserServiceImpl implements UserService {
    @Override
    public void saveUser(User user) {
        System.out.println("模拟保存用户数据，保存成功！");
    }

    @Override
    public void updateUser(User user) {
        System.out.println("模拟更新用户数据，更新成功！");
    }

    @Override
    public User getUserById(Integer id) {
        User user = new User();
        user.setId(1);
        user.setUserName("杨杰炜");
        user.setCity("广州");
        if (id == 1) {
            return user;
        }else {
            return null;
        }
    }

    @Override
    public List<User> getAllUser() {
        List<User> users = new ArrayList<User>();
        User user1 = new User();
        user1.setId(1);
        user1.setUserName("小明");
        user1.setCity("北京");

        List<Car> carList1 = new ArrayList<Car>();
        Car car1 = new Car();
        car1.setId(101);
        car1.setCarName("保时捷");
        car1.setPrice(1000000d);
        carList1.add(car1);
        Car car2 = new Car();
        car2.setId(102);
        car2.setCarName("宝马");
        car2.setPrice(400000d);
        carList1.add(car2);
        user1.setCars(carList1);

        users.add(user1);

        User user2 = new User();
        user2.setId(2);
        user2.setUserName("小丽");
        user2.setCity("上海");
        users.add(user2);

        return users;
    }

    @Override
    public void deleteUser(Integer id) {
        System.out.println("模拟删除用户，删除成功，用户的ID是：" + id);
    }
}
