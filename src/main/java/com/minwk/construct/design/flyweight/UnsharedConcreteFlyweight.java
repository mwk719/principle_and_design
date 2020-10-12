package com.minwk.construct.design.flyweight;

//非享元角色 = 非共享对象和属性
class UnsharedConcreteFlyweight {
	private String info;

	UnsharedConcreteFlyweight(String info) {
		this.info = info;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}
}