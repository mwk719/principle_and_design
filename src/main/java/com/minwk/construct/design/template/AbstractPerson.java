package com.minwk.construct.design.template;

/**
 * 人也具有动物的本能
 *
 * @author MinWeikai
 * @date 2021/6/5 11:30
 */
public abstract class AbstractPerson implements AnimalInstinct {

	protected String name = "所有人";

	protected abstract void think();

	void life(String name){
		this.name = name;
		this.think();
		this.happy();
	}

	void happy() {
		this.eat();
		this.play();
	}
}
