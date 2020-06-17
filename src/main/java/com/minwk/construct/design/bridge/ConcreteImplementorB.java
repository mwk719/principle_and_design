package com.minwk.construct.design.bridge;

//具体实现化角色
class ConcreteImplementorB implements Implementor {
	@Override
	public void OperationImpl() {
		System.out.println("具体实现化(ConcreteImplementorB)角色被访问");
	}
}