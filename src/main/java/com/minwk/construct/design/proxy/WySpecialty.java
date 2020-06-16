package com.minwk.construct.design.proxy;

import com.minwk.construct.utils.PathUtil;

import javax.swing.*;
import java.awt.*;

//真实主题：婺源特产
class WySpecialty extends JFrame implements Specialty {
	private static final long serialVersionUID = 1L;

	public WySpecialty() {
		super("韶关代理婺源特产测试");
		this.setLayout(new GridLayout(1, 1));
		JLabel l1 = new JLabel(new ImageIcon(PathUtil.getResources("1591931402555.jpg", WySpecialty.class)));
		this.add(l1);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void display() {
		this.setVisible(true);
	}
}