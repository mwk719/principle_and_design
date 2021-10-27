package com.minwk.construct.design.event;

import com.minwk.construct.pojo.User;
import org.springframework.context.ApplicationEvent;

/**
 * 发送消息事件
 *
 * @author MinWeikai
 * @date 2021/10/26 15:03
 */
public class SendMsgEvent extends ApplicationEvent {

    private User user;

    public SendMsgEvent(Object source, User user) {
        super(source);
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
