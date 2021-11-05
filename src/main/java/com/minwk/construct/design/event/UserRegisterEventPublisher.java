package com.minwk.construct.design.event;

import com.minwk.construct.pojo.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * 用户注册事件发布
 *
 * @author MinWeikai
 * @date 2021-11-01 17:45:06
 */
@Component
public class UserRegisterEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publish(User user) {
        this.applicationEventPublisher.publishEvent(new UserRegisterEvent(this, user));
    }
}
