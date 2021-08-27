package com.minwk.construct.design.chain;

/**
 * @author MinWeikai
 * @date 2021/8/27 11:42
 */
public class AbstractHandlerTest {

    public static void main(String[] args) {
        AbstractHandler handler1 = new LittleBossHandler("孙兴", "一般");
        AbstractHandler handler2 = new BigBossHandler("高明远", "麻烦");
        handler1.setUmbrella(handler2);
        handler1.handleRequest("杀了一般的小鸡");
        System.out.println("------------------------------");
        handler1.handleRequest("杀了麦自立，惹了麻烦");
        System.out.println("------------------------------");
        handler1.handleRequest("大江潜伏调查");
    }
}
