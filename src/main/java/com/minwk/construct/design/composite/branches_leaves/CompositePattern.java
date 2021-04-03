package com.minwk.construct.design.composite.branches_leaves;

public class CompositePattern {
	public static void main(String[] args) {
		Component c0 = new Composite();
		Component c1 = new Composite();
		Component c2 = new Composite();
		Component leaf1 = new Leaf("1");
		Component leaf2 = new Leaf("2");
		Component leaf3 = new Leaf("3");
		Component leaf4 = new Leaf("4");

		//c0树枝-树叶1
		c0.add(leaf1);

		//c0树枝-c1树枝
		c0.add(c1);
		//c1树枝-树叶2
		c1.add(leaf2);
		//c1树枝-树叶3
		c1.add(leaf3);

		c0.add(c2);
		c2.add(leaf4);

		//循环输出所有树枝上的树叶
		c0.operation();
	}
}