package com.example.provider.service;

import com.alex.api.IUserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * *
 *
 * @ClassName :wangyu
 * @Description
 * @Author
 * @Date2020/5/15 21:06
 * @Version V1.0
 */

@Component//受spring管理组件
@Service//
public class UserSerivceImpl implements IUserService {
    @Override
    public String hello() {
        return "SPRINGBOOT+DUBBO!!!!123";
    }
}
