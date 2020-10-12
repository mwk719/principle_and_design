package com.minwk.construct.design.composite.shopping;

import java.util.ArrayList;

//树枝构件：袋子
class Bags implements Articles {
	private String name;     //名字
	private ArrayList<Articles> bags = new ArrayList<Articles>();

	public Bags(String name) {
		this.name = name;
	}

	public void add(Articles c) {
		bags.add(c);
	}

	public void remove(Articles c) {
		bags.remove(c);
	}

	public Articles getChild(int i) {
		return bags.get(i);
	}

	/**
	 * 树枝方法计算
	 * @return
	 */
	@Override
	public float calculation() {
		float s = 0;
		for (Object obj : bags) {
			//调用最小节点方法计算
			s += ((Articles) obj).calculation();
		}
		return s;
	}

	@Override
	public void show() {
		for (Object obj : bags) {
			((Articles) obj).show();
		}
	}
}