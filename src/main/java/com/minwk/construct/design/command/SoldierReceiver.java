package com.minwk.construct.design.command;

/**
 * 士兵接收者
 *
 * @author MinWeikai
 * @date 2021/8/23 14:42
 */
public class SoldierReceiver {

    public SoldierReceiver(String name) {
        this.name = name;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void action(String msg) {
        System.out.println("士兵：" + this.getName() + "接收者已执行-" + msg);
    }
}
