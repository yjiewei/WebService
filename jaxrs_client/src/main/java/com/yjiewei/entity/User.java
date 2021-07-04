package com.yjiewei.entity;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author com.com.yjiewei
 * @date 2021/7/4
 */
@XmlRootElement(name = "User")
public class User {
    private Integer id;
    private String userName;
    private String city;

    private List<Car> cars = new ArrayList<Car>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", city='" + city + '\'' +
                ", cars=" + cars +
                '}';
    }
}
