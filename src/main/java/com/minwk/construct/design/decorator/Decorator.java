package com.minwk.construct.design.decorator;

//抽象装饰角色
public class Decorator implements Component
{
    private Component component;   
    public Decorator(Component component)
    {
        this.component=component;
    }

    @Override
    public void operation()
    {
        component.operation();
    }
}