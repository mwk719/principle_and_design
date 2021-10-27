package com.minwk.construct.design.event;

import com.minwk.construct.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author MinWeikai
 * @date 2021/10/26 15:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SendMsgEventPublisherTest {
    @Autowired
    private SendMsgEventPublisher sendMsgEventPublisher;

    @Test
    public void publish() {
        User user = new User();
        user.setName("君莫笑");
        user.setMsg("发起进攻！");
        sendMsgEventPublisher.publish(user);

    }
}