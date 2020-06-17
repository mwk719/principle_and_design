package com.minwk.construct.design.bridge;

//具体实现化角色
class ConcreteImplementorA implements Implementor {
	@Override
	public void OperationImpl() {
		System.out.println("具体实现化(ConcreteImplementorA)角色被访问");
	}
}