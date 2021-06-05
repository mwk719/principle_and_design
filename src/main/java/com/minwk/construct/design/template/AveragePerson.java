package com.minwk.construct.design.template;

/**
 * 具体的普通人
 *
 * @author MinWeikai
 * @date 2021/6/5 11:33
 */
public class AveragePerson extends AbstractPerson {
	@Override
	protected void think() {
		System.out.println(name +"今天要搬砖还是躺平？");
	}

	@Override
	public void play() {
		System.out.println(name +"玩游戏");
	}

	@Override
	public void eat() {
		System.out.println(name +"吃烧烤");
	}
}
