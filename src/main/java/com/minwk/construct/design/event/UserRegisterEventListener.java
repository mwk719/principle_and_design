package com.minwk.construct.design.event;

import com.minwk.construct.pojo.User;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 用户注册事件监听
 *
 * @author MinWeikai
 * @date 2021-11-01 17:43:09
 */
@Slf4j
@Component
public class UserRegisterEventListener implements ApplicationListener<UserRegisterEvent> {

    @SneakyThrows
    @Override
    public void onApplicationEvent(UserRegisterEvent userRegisterEvent) {
        User user = userRegisterEvent.getUser();
        log.info("用户：[{}] 进行了注册，开始发放奖励", user.getName());
        Thread.sleep(1000);
        log.info("执行发放奖品");
        Thread.sleep(1000);
        log.info("执行发放积分");
        Thread.sleep(1000);
        log.info("执行发送短信");
        Thread.sleep(1000);
        log.info("新用户奖励发放完成");
    }
}
