package com.minwk.construct.design.template;

/**
 * @author MinWeikai
 * @date 2021/6/5 11:35
 */
public class PersonTest {

	public static void main(String[] args) {

		AbstractPerson averagePerson = new AveragePerson();
		averagePerson.life("小明");
	}
}
