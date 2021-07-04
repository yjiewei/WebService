package com.yjiewei.impl;

import com.yjiewei.IHelloService;

/**
 * @author com.com.yjiewei
 * @date 2021/7/3
 */
public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return name + "发来贺电!";
    }
}
