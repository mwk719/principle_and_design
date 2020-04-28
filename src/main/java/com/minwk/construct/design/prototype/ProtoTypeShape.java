package com.minwk.construct.design.prototype;

public class ProtoTypeShape
{
    public static void main(String[] args)
    {
        ProtoTypeManager pm=new ProtoTypeManager();    
        Shape obj1= pm.getShape("Circle");
        obj1.countArea();          
        Shape obj2= pm.getShape("Square");
        obj2.countArea();     
    }
}