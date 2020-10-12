package com.minwk.construct.design.composite.branches_leaves;

//抽象构件
interface Component {
	public void add(Component c);

	public void remove(Component c);

	public Component getChild(int i);

	public void operation();
}