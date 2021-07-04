package com.yjiewei;

import javax.jws.WebService;

/**
 * @author com.com.yjiewei
 * @date 2021/7/3
 */
@WebService // 可别忘记加这个
public interface IHelloService {

    public String sayHello(String name);
}
