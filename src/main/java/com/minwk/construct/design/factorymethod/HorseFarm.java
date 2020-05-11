package com.minwk.construct.design.factorymethod;

//具体工厂：养马场
class HorseFarm implements AnimalFarm
{
    @Override
    public Animal newAnimal()
    {
        System.out.println("新马出生！");
        return new Horse();
    }
}