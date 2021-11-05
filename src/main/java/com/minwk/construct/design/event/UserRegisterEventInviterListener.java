package com.minwk.construct.design.event;

import com.minwk.construct.pojo.User;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 用户注册事件邀请人监听
 *
 * @author MinWeikai
 * @date 2021-11-01 17:43:09
 */
@Slf4j
@Component
public class UserRegisterEventInviterListener implements ApplicationListener<UserRegisterEvent> {

    @SneakyThrows
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        User user = userRegisterEvent.getUser();
        log.info("用户：[{}] 进行了注册，开始发放邀请人奖励", user.getName());
        Thread.sleep(1000);
        log.info("邀请人奖励发放完成");
    }
}
