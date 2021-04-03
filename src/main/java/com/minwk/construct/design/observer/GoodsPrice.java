package com.minwk.construct.design.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 *
 * @author MinWeikai
 * @date 2021/4/3 19:16
 */
public class GoodsPrice implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof Goods) {
			Goods goods = (Goods) o;
			System.out.println(String.format("商品:[%s] 价格从[%s] 已调整为[%s]", goods.getName(), goods.getPrice(), arg.toString()));
		}
	}
}
