package com.alex.consumer;

import com.alex.api.IUserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * *
 *
 * @ClassName :wangyu
 * @Description
 * @Author
 * @Date2020/5/15 13:52
 * @Version V1.0
 */
public class Consumer {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:dubbo-consumer.xml"});
        context.start();
        //获取远程服务
        for (int i = 0; i < 4; i++) {
            IUserService userService = context.getBean(IUserService.class);
            System.out.println("获取服务："+userService.hello());
        }
        try {
            System.in.read(); // press any key to exit
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
