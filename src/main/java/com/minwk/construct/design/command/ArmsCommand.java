package com.minwk.construct.design.command;

/**
 * 兵种的抽象命令
 * 不同兵种处理不同的命令
 * 如 炮兵负责开炮、骑兵负责冲锋
 *
 * @author MinWeikai
 * @date 2021/8/23 14:33
 */
public interface ArmsCommand {

    /**
     * 执行的抽象方法
     */
    void execute();

}
