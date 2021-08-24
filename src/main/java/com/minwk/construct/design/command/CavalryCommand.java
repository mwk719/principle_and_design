package com.minwk.construct.design.command;

/**
 * 骑兵命令
 *
 * @author MinWeikai
 * @date 2021/8/23 14:40
 */
public class CavalryCommand implements ArmsCommand {

    public CavalryCommand(SoldierReceiver soldierReceiver) {
        this.soldierReceiver = soldierReceiver;
    }

    /**
     * 命令接收处理者
     */
    private SoldierReceiver soldierReceiver;

    @Override
    public void execute() {
        System.out.println("骑兵连！进攻！");
        soldierReceiver.action("骑兵连冲锋！");
    }

}
