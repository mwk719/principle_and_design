package com.minwk.construct.principle.dip;

//顾客
class Customer
{
    public void shopping(Shop shop)
    {
        //购物
        System.out.println(shop.sell()); 
    }

    public void wuyuanShop(WuyuanShop wuyuanShop)
    {
        //购物
        System.out.println(wuyuanShop.sell());
    }
}