package com.minwk.construct.design.command;

/**
 * @author MinWeikai
 * @date 2021/8/23 15:50
 */
public class ArmsCommandTest {

    public static void main(String[] args) {
        // 指挥者李云龙
        HeadInvoker invoker = new HeadInvoker("李云龙");
        // 发出了炮兵命令，由二营长进行
        ArmsCommand command = new ArtilleryCommand(new SoldierReceiver("二营长"));
        // 调用了开火方法
        invoker.fire(command);
        System.out.println("-------------------------------------------------");
        // 指挥者孔二愣子
        invoker = new HeadInvoker("孔二愣子");
        // 发出了炮兵命令，由一营长进行
        ArmsCommand command1 = new ArtilleryCommand(new SoldierReceiver("一营长"));
        // 调用了开火方法
        invoker.fire(command1);
        System.out.println("-------------------------------------------------");
        // 指挥者
        invoker = new HeadInvoker("孙德胜");
        ArmsCommand command2 = new CavalryCommand(new SoldierReceiver("众骑兵"));
        invoker.fire(command2);

    }
}
