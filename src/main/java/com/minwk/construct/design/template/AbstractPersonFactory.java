package com.minwk.construct.design.template;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * 人类角色工厂
 *
 * @author MinWeikai
 * @date 2021/6/5 12:12
 */
public class AbstractPersonFactory {

	static Map<String, AbstractPerson> personMap = new HashMap<>();

	static {
		personMap.put("averagePerson", new AveragePerson());
		personMap.put("civilServant", new CivilServant());
	}

	public static AbstractPerson getPerson(String character) throws Exception {
		return Optional.ofNullable(personMap.get(character)).orElseThrow(Exception::new);
	}
}
