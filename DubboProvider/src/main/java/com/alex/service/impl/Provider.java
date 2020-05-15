package com.alex.service.impl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * *
 *
 * @ClassName :wangyu
 * @Description
 * @Author
 * @Date2020/5/15 13:39
 * @Version V1.0
 */
public class Provider {
    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-provider.xml"});
        context.start();
        System.out.println("发布服务成功");
        try {
            System.in.read(); // press any key to exit
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
