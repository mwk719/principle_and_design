package com.minwk.construct.design.flyweight;

import java.util.HashMap;

//享元工厂角色 = 制造和存储对象，对象不存在时创建，存在时则取出
class FlyweightFactory {
	private HashMap<String, Flyweight> flyweights = new HashMap<>();

	public Flyweight getFlyweight(String key) {
		Flyweight flyweight = flyweights.get(key);
		if (flyweight != null) {
			System.out.println("具体享元" + key + "已经存在，被成功获取！");
		} else {
			flyweight = new ConcreteFlyweight(key);
			flyweights.put(key, flyweight);
		}
		System.out.println("享元角色 hashCode " + flyweight.hashCode());
		return flyweight;
	}
}