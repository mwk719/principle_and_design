package com.minwk.construct.design.command;

/**
 * 炮兵命令
 *
 * @author MinWeikai
 * @date 2021/8/23 14:40
 */
public class ArtilleryCommand implements ArmsCommand {

    public ArtilleryCommand(SoldierReceiver soldierReceiver) {
        this.soldierReceiver = soldierReceiver;
    }

    /**
     * 命令接收处理者
     */
    private SoldierReceiver soldierReceiver;

    @Override
    public void execute() {
        System.out.println(soldierReceiver.getName() + "，你他娘的意大利炮呢？");
        soldierReceiver.action();
    }

}
