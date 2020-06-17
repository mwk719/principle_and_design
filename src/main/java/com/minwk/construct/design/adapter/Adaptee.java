package com.minwk.construct.design.adapter;

//适配者接口
class Adaptee {
	/**
	 * 1. 旧方法不适合新接口
	 * 2. 适配第三方接口与自定义接口
	 */
	public void specificRequest() {
		System.out.println("适配者中的业务代码被调用！");
	}
}