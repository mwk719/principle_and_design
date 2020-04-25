package com.minwk.construct.principle.dip;

/**
 * @author minweikai
 */
public class DipTest
{
    public static void main(String[] args)
    {
        Customer wang=new Customer();
        System.out.println("顾客购买以下商品：");
        //顾客每更换一家商店，都要修改一次代码
        wang.wuyuanShop(new WuyuanShop());

        //用户的购买应该抽象的商店，有新的商店创建时需要去实现抽象的商店的方法
        //抽象的用户应该依赖抽象的商店，而不是具体的商店
        //实现业务中发现不同类有相同方法时可以考虑抽象去实现
        wang.shopping(new ShaoguanShop()); 
        wang.shopping(new WuyuanShop());

    }
}