package com.minwk.construct.design.chain;

/**
 * @author MinWeikai
 * @date 2021/8/26 16:29
 */
public class BigBossHandler extends AbstractHandler {

    public BigBossHandler(String name, String handleLevel) {
        this.setName(name);
        this.setHandleLevel(handleLevel);
    }

    @Override
    public void handleBySelf(String request) {
        System.out.println(this.getName()
                .concat("喝点茶处理：")
                .concat(request));
    }

    @Override
    public void helplessSay(String request) {
        System.out.println(this.getName()
                .concat("无助地说：我头大！"));
    }
}
