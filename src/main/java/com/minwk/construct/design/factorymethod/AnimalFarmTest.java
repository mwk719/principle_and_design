package com.minwk.construct.design.factorymethod;

public class AnimalFarmTest {
	public static void main(String[] args) {
		try {
			//利用工厂模式实现处理同类业务解耦
			AnimalFarm af = new CattleFarm();
			Animal a = af.newAnimal();
			a.show();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}