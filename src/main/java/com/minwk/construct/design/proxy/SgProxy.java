package com.minwk.construct.design.proxy;

//代理：韶关代理
class SgProxy implements Specialty {
	private WySpecialty realSubject = new WySpecialty();

	@Override
	public void display() {
		preRequest();
		//对这个方法进行代理，增强方法的使用
		realSubject.display();
		postRequest();
	}

	public void preRequest() {
		System.out.println("韶关代理婺源特产开始。");
	}

	public void postRequest() {
		System.out.println("韶关代理婺源特产结束。");
	}
}