package com.minwk.construct.design.event;

import com.minwk.construct.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 发送消息事件监听
 * @author MinWeikai
 * @date 2021/10/26 15:08
 */
@Slf4j
@Component
public class SendMsgEventListener implements ApplicationListener<SendMsgEvent> {

    @Override
    public void onApplicationEvent(SendMsgEvent fightEvent) {
        User user = fightEvent.getUser();
        log.info("玩家[{}]，发出信号：{}", user.getName(), user.getMsg());
    }
}
