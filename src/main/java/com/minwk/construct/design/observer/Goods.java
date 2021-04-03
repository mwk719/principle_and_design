package com.minwk.construct.design.observer;

import java.math.BigDecimal;
import java.util.Observable;

/**
 * 被观察对象
 *
 * @author MinWeikai
 * @date 2021/4/3 19:10
 */
public class Goods extends Observable {

	private String name;

	private BigDecimal price;

	public Goods() {
	}

	public Goods(String name, BigDecimal price) {
		this.name = name;
		this.price = price;
	}

	public Goods priceUp(BigDecimal price) {
		// 标注价格已经被更改
		this.setChanged();
		// 通知观察者
		this.notifyObservers(price);
		this.price = price;
		return this;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
}
