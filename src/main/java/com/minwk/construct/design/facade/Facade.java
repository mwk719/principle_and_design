package com.minwk.construct.design.facade;

//外观角色
class Facade {
	private SubSystem01 obj1 = new SubSystem01();
	private SubSystem02 obj2 = new SubSystem02();
	private SubSystem03 obj3 = new SubSystem03();

	/**
	 * 外观模式
	 * 统一复杂子系统的方法，对外提供一个可供调用的方法
	 * 简化系统之间的调用
	 */
	public void method() {
		//子系统的方法
		obj1.method1();
		obj2.method2();
		obj3.method3();
	}
}