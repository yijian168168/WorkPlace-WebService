package com.webservice.impl;

import com.webservice.beans.User;
import com.webservice.intf.OrderService;

import javax.jws.WebService;
import java.io.UnsupportedEncodingException;

/**
 * webservice 接口实现类
 * Created by Lenovo-PC-QR on 2016/11/6.
 */
@WebService(endpointInterface = "com.webservice.intf.OrderService", serviceName = "OrderService", targetNamespace = "www.qingrong.com")
public class OrderServiceImpl implements OrderService {

    @Override
    public String deal(String orderid) {
        System.out.println(orderid);
        return "received : " + orderid;
    }

    @Override
    public User dealUser(User user) {
        try {
            String name = new String(user.getName().getBytes("GBK"), "UTF-8");
            user.setName(name);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println(user);
        user.setName("乐乐");
        return user;
    }
}
