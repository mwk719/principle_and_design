package com.minwk.construct.design.template;

/**
 * 具体的公务员
 *
 * @author MinWeikai
 * @date 2021/6/5 11:33
 */
public class CivilServant extends AbstractPerson {
	@Override
	protected void think() {
		System.out.println(name +"一切为了人民！");
	}

	@Override
	public void play() {
		System.out.println(name +"玩游戏");
	}

	@Override
	public void eat() {
		System.out.println(name +"吃皇粮");
	}
}
