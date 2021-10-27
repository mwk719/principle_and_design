package com.minwk.construct.design.event;

import com.minwk.construct.pojo.User;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * 事件发布
 *
 * @author MinWeikai
 * @date 2021/10/26 15:04
 */
@Component
public class SendMsgEventPublisher implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void publish(User user) {
        this.applicationEventPublisher.publishEvent(new SendMsgEvent(this, user));
    }
}
