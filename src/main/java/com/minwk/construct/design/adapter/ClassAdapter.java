package com.minwk.construct.design.adapter;

//类适配器类
class ClassAdapter extends Adaptee implements Target
{
    /**
     * 新接口方法
     */
    @Override
    public void request()
    {
        specificRequest();
    }
}