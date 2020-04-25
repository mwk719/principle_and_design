package com.minwk.construct.principle.lsp;

/**
 * 几维鸟类，不会飞，不能去继承鸟的飞行方法
 */
class BrownKiwi extends Bird {
	@Override
	public void setSpeed(double speed) {
		flySpeed = 0;
	}
}