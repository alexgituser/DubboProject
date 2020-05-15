package com.consumer;

import com.alex.api.IUserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootAnnotationConsumerApplicationTests {

    @Reference
    private IUserService userService;

    @Test
    public void contextLoads() {
        System.out.println(userService.hello() );
    }

}
