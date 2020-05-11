package com.minwk.construct.utils;

/**
 * 路径
 *
 * @author MinWeikai
 * @date 2020/5/11 18:00
 */
public class PathUtil {

	/**
	 * 资源
	 */
	private final static String RESOURCES = "src/main/resources/";

	/**
	 * 获取当前类所在最后一级路径对应资源所在路径
	 *
	 * @param name  文件名
	 * @param Class 当前类
	 * @return
	 */
	public static String getResources(String name, Class<?> Class) {
		String temp = Class.toString();
		System.out.println(temp);
		String[] resources = temp.split("\\.");
		return RESOURCES + resources[4] + "/" + name;

	}

	public static void main(String[] args) {

		System.out.println(getResources("1111", PathUtil.class));

	}
}
