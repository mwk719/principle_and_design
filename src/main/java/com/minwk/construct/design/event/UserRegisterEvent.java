package com.minwk.construct.design.event;

import com.minwk.construct.pojo.User;
import org.springframework.context.ApplicationEvent;

/**
 * 用户注册事件
 *
 * @author MinWeikai
 * @date 2021-11-01 17:42:33
 */
public class UserRegisterEvent extends ApplicationEvent {

    private User user;

    public UserRegisterEvent(Object source, User user) {
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
