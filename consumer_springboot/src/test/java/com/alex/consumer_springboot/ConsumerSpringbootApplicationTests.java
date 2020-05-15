package com.alex.consumer_springboot;

import com.alex.api.IUserService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ConsumerSpringbootApplicationTests {

    @Autowired
    private IUserService userService;

    @Test
    public void contextLoads() {
        System.out.println(userService.hello());
    }

}
