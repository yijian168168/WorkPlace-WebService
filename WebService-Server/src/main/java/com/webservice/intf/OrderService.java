package com.webservice.intf;

import com.webservice.beans.User;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * Created by Lenovo-PC-QR on 2016/11/6.
 */
@WebService
public interface OrderService {

    public String deal(@WebParam(name="orderid") String orderid);

    public User dealUser(User user);
}
