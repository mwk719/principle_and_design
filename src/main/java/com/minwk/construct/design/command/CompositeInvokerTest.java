package com.minwk.construct.design.command;

/**
 * 命令复合调用
 *
 * @author MinWeikai
 * @date 2021/8/26 15:56
 */
public class CompositeInvokerTest {

    public static void main(String[] args) {
        ArmsCommand command1 = new ArtilleryCommand(new SoldierReceiver("二营长"));
        ArmsCommand command2 = new CavalryCommand(new SoldierReceiver("众骑兵"));
        CompositeInvoker invoker = new CompositeInvoker("李云龙");
        // 组装命令去批量执行
        invoker.add(command1);
        invoker.add(command2);
        invoker.fire();
        System.out.println("-------------------------------------------------");

    }
}
