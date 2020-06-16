package com.minwk.construct.design.builder;

/**
 * 建造者模式适合复杂且多变的业务模块
 *
 * @author MinWeikai
 * @date 2020-05-25 14:22:18
 */
public class Client {
	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		Product product = director.construct();
		product.show();
	}
}