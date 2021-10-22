package com.minwk.construct.design.anonymousclass;

/**
 * @author MinWeikai
 * @date 2021/10/22 10:33
 */
public class ComputeMethodTest {

    public static void main(String[] args) {
        // 通用方法可单独提出来
        new ComputeMethod("加", new CommonAddCollectResult()).exec(1, 3);

        // 实现接口的匿名类
        // 自定义规则
        new ComputeMethod("自定规则", new CollectResultInterface() {
            @Override
            public Integer process(Integer x, Integer y) {
                // 业务加工过程
                return x + y * x - y;
            }
        }).exec(14, 250);

        // lambda写法
        new ComputeMethod("自定规则", (x, y) -> (x * y) - x).exec(14250, 6);


        new Thread(new Runnable() {
            @Override
            public void run() {
                // 编写自己的业务
                System.out.println("线程测试");
            }
        }).start();

    }
}
