package com.minwk.construct.design.anonymousclass;

/**
 * 计算方法
 *
 * @author MinWeikai
 * @date 2021/10/22 10:30
 */
public class ComputeMethod {

    public ComputeMethod() {
    }

    public ComputeMethod(String name, CollectResultInterface collectResultInterface) {
        this.name = name;
        this.collectResultInterface = collectResultInterface;
    }

    /**
     * 方法名
     */
    private String name;

    private CollectResultInterface collectResultInterface;

    /**
     * 执行构建的方法
     * @param x
     * @param y
     */
    public void exec(Integer x, Integer y) {
        System.out.println("----------------开始-------------------");
        // 处理数据
        int result = collectResultInterface.process(x, y);
        System.out.println(x + " " + name + " " + y + " = " + result);
        System.out.println("----------------结束-------------------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CollectResultInterface getCollectResultInterface() {
        return collectResultInterface;
    }

    public void setCollectResultInterface(CollectResultInterface collectResultInterface) {
        this.collectResultInterface = collectResultInterface;
    }
}
