package com.minwk.construct.design.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 命令复合调用
 *
 * @author MinWeikai
 * @date 2021/8/26 15:52
 */
public class CompositeInvoker extends HeadInvoker implements ArmsCommand {

    private List<ArmsCommand> commands = new ArrayList<>();

    public CompositeInvoker(String name) {
        super(name);
    }

    public void add(ArmsCommand command) {
        this.commands.add(command);
    }

    public void remove(ArmsCommand command) {
        this.commands.remove(command);
    }

    @Override
    public void execute() {
        commands.forEach(ArmsCommand::execute);
    }

    /**
     * 开火
     */
    public void fire() {
        System.out.println("指挥者：" + super.getName() + "发出命令");
        this.execute();
    }
}
