package com.minwk.construct.design.chain;

/**
 * @author MinWeikai
 * @date 2021/8/26 16:29
 */
public class LittleBossHandler extends AbstractHandler {

    public LittleBossHandler(String name, String handleLevel) {
        this.setName(name);
        this.setHandleLevel(handleLevel);
    }

    @Override
    public void handleBySelf(String request) {
        System.out.println(this.getName()
                .concat("轻松处理：")
                .concat(request));
    }

    @Override
    public void helplessSay(String request) {
        System.out.println(this.getName()
                .concat("无助地说：我真可怜，没有保护伞！"));
    }
}
