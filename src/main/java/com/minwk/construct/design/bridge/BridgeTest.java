package com.minwk.construct.design.bridge;

public class BridgeTest
{
    /**
     * 理解！！！
     * 桥接模式通常适用于以下场景。
     * 当一个类存在两个独立变化的维度，且这两个维度都需要进行扩展时。
     * 当一个系统不希望使用继承或因为多层次继承导致系统类的个数急剧增加时。
     * 当一个系统需要在构件的抽象化角色和具体化角色之间增加更多的灵活性时。
     * @param args
     */
    public static void main(String[] args)
    {
        Implementor imple=new ConcreteImplementorB();
        Abstraction abs=new RefinedAbstraction(imple);
        abs.Operation();
    }
}