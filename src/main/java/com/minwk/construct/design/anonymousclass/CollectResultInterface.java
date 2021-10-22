package com.minwk.construct.design.anonymousclass;

/**
 * 收集结果接口
 *
 * @author MinWeikai
 * @date 2021/10/22 10:23
 */
@FunctionalInterface
public interface CollectResultInterface {
    /**
     * 获取接结果
     *
     * @param x
     * @param y
     * @return
     */
    Integer process(Integer x, Integer y);

}
