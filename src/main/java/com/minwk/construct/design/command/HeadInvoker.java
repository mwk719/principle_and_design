package com.minwk.construct.design.command;

/**
 * 首长调用者
 *
 * @author MinWeikai
 * @date 2021/8/23 14:35
 */
public class HeadInvoker {

    public HeadInvoker(String name) {
        this.name = name;
    }

    /**
     * 调用者姓名
     */
    private String name;

    public String getName() {
        return name;
    }

    /**
     * 开火方法，用于调用命令
     *
     * @param command
     */
    public void fire(ArmsCommand command) {
        System.out.println("指挥者：" + name + "发出命令");
        command.execute();
    }
}
