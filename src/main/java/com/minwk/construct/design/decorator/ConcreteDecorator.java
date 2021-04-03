package com.minwk.construct.design.decorator;

//具体装饰角色
public class ConcreteDecorator extends Decorator {
	public ConcreteDecorator(Component component) {
		super(component);
	}

	/**
	 * 使用装饰模式可以灵活扩展对象的原有功能，但是会增加许多子类
	 */
	public void operation() {
		//原有对象的方法
		super.operation();
		//扩展的方法
		addedFunction();
	}

	public void addedFunction() {
		System.out.println("为具体构件角色增加额外的功能addedFunction()");
	}
}
