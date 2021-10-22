package com.minwk.construct.design.anonymousclass;

/**
 * 通用相加类
 *
 * @author MinWeikai
 * @date 2021/10/22 11:31
 */
public class CommonAddCollectResult implements CollectResultInterface {
    @Override
    public Integer process(Integer x, Integer y) {
        return x + y;
    }
}
