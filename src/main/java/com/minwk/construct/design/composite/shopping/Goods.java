package com.minwk.construct.design.composite.shopping;

//树叶构件：商品
class Goods implements Articles {
	private String name;     //名字
	private int quantity;    //数量
	private float unitPrice; //单价

	public Goods(String name, int quantity, float unitPrice) {
		this.name = name;
		this.quantity = quantity;
		this.unitPrice = unitPrice;
	}

	/**
	 * 最小节点方法
	 *
	 * @return
	 */
	@Override
	public float calculation() {
		return quantity * unitPrice;
	}

	@Override
	public void show() {
		System.out.println(name + "(数量：" + quantity + "，单价：" + unitPrice + "元)");
	}
}