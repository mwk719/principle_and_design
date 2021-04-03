package com.minwk.construct.design.flyweight;

public class FlyweightPattern {
	public static void main(String[] args) {
		FlyweightFactory factory = new FlyweightFactory();
		//该属性对象是否存在，如存在即可直接拿出来使用，无需重复创建，减少使用的资源空间
		Flyweight a1 = factory.getFlyweight("a");
		Flyweight a2 = factory.getFlyweight("a");
		Flyweight a3 = factory.getFlyweight("a");

		Flyweight b1 = factory.getFlyweight("b");
		Flyweight b2 = factory.getFlyweight("b");

		//使用非享元角色调用享元角色
		a1.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
		a2.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
		a3.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
		b1.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
		b2.operation(new UnsharedConcreteFlyweight("第2次调用b。"));
	}
}