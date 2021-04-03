package com.minwk.construct.design.composite.branches_leaves;

import java.util.ArrayList;

//树枝构件
class Composite implements Component {
	private ArrayList<Component> children = new ArrayList<>();

	@Override
	public void add(Component c) {
		children.add(c);
	}

	@Override
	public void remove(Component c) {
		children.remove(c);
	}

	@Override
	public Component getChild(int i) {
		return children.get(i);
	}

	@Override
	public void operation() {
		for (Object obj : children) {
			((Component) obj).operation();
		}
	}
}