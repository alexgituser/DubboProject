package com.alex.dubbo.service;

import com.alex.api.IUserService;

/**
 * *
 *
 * @ClassName :wangyu
 * @Description
 * @Author
 * @Date2020/5/15 17:14
 * @Version V1.0
 */
public class UserSerivceImpl implements IUserService {
    @Override
    public String hello() {
        return "hello,spring,dubbo";
    }
}
