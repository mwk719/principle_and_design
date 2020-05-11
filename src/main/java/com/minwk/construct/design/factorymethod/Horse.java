package com.minwk.construct.design.factorymethod;

import com.minwk.construct.utils.PathUtil;

import javax.swing.*;
import java.awt.*;

//具体产品：马类
class Horse implements Animal
{
    JScrollPane sp;
    JFrame jf=new JFrame("工厂方法模式测试");
    public Horse()
    {
        Container contentPane=jf.getContentPane();
        JPanel p1=new JPanel();
        p1.setLayout(new GridLayout(1,1));
        p1.setBorder(BorderFactory.createTitledBorder("动物：马"));
        sp=new JScrollPane(p1);
        contentPane.add(sp, BorderLayout.CENTER);
        JLabel l1=new JLabel(new ImageIcon(PathUtil.getResources("A_Horse.jpg", Horse.class)));
        p1.add(l1);
        jf.pack();       
        jf.setVisible(false);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //用户点击窗口关闭 
    }
    @Override
    public void show()
    {
        jf.setVisible(true);
    }
}