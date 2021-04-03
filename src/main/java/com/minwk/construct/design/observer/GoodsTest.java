package com.minwk.construct.design.observer;

import java.math.BigDecimal;

/**
 * @author MinWeikai
 * @date 2021/4/3 19:18
 */
public class GoodsTest {

	public static void main(String[] args) {
		Goods goods = new Goods("草莓", BigDecimal.ONE);
		goods.addObserver(new GoodsPrice());
		goods.priceUp(BigDecimal.TEN);
		goods.priceUp(BigDecimal.TEN.add(BigDecimal.TEN));

		Goods goods1 = new Goods("苹果", BigDecimal.TEN);
		goods1.addObserver(new GoodsPrice());
		goods1.priceUp(BigDecimal.ONE);
	}

}
