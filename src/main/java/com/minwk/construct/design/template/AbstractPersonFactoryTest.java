package com.minwk.construct.design.template;

/**
 * @author MinWeikai
 * @date 2021/6/5 12:17
 */
public class AbstractPersonFactoryTest {

	public static void main(String[] args) throws Exception {
		AbstractPerson averagePerson = AbstractPersonFactory.getPerson("averagePerson");
		averagePerson.life("张伟");

	}
}
