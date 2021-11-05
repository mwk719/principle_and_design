package com.minwk.construct.design.event;

import com.minwk.construct.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author MinWeikai
 * @date 2021-11-01 17:45:43
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserRegisterEventPublisherTest {
    @Autowired
    private UserRegisterEventPublisher userRegisterEventPublisher;

    @Test
    public void publish() throws InterruptedException {
        User user = new User();
        user.setName("君莫笑");
        userRegisterEventPublisher.publish(user);
        Thread.sleep(1000*10);
    }
}