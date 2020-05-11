package com.minwk.construct.design.factorymethod;

//具体工厂：养牛场
class CattleFarm implements AnimalFarm
{
    @Override
    public Animal newAnimal()
    {
        System.out.println("新牛出生！");
        return new Cattle();
    }
}