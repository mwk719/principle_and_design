package com.minwk.construct.principle.lsp;

/**
 * 鸟类
 */
class Bird {
	double flySpeed;

	public void setSpeed(double speed) {
		flySpeed = speed;
	}

	double getFlyTime(double distance) {
		return (distance / flySpeed);
	}
}