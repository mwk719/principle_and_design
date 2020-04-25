package com.minwk.construct.principle.lsp;

/**
 * @author minweikai
 */
class LspTest {
	public static void main(String[] args) {
		Bird bird1 = new Swallow();
		Bird bird2 = new BrownKiwi();
		bird1.setSpeed(120);
		bird2.setSpeed(120);
		System.out.println("如果飞行300公里：");
		try {
			System.out.println("燕子将飞行" + bird1.getFlyTime(300) + "小时.");
			//重写了父类的方法，违背了里氏替换原则
			System.out.println("几维鸟将飞行" + bird2.getFlyTime(300) + "小时。");
		} catch (Exception err) {
			System.out.println("发生错误了!");
		}
	}
}