package com.minwk.construct.design.flyweight;

//抽象享元角色 = 共享对象接口
interface Flyweight {
	/**
	 * 含共享信息和非共享信息的操作方法
	 *
	 * @param state 非共享对象/属性
	 */
	void operation(UnsharedConcreteFlyweight state);
}