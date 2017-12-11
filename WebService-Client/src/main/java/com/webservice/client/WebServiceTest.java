package com.webservice.client;

import com.webservice.beans.User;
import com.webservice.intf.OrderService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.UnsupportedEncodingException;

/**
 * Created by ZhangQingrong on 2017/6/29.
 */
public class WebServiceTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/springContext.xml");
        OrderService bean = applicationContext.getBean(OrderService.class);
        String result = bean.deal("hello");
        System.out.println(result);
    }

    @Test
    public void testUser() throws UnsupportedEncodingException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/springContext.xml");
        OrderService bean = applicationContext.getBean(OrderService.class);
        User user = new User();
        user.setName("庆荣");
        user.setAge(25);
        User deal = bean.dealUser(user);
        System.out.println(deal);
    }
}
