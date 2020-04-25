package com.minwk.construct.principle.isp;

public class IspTest
{
    public static void main(String[] args)
    {
        //接口类中接口多，可以考虑解耦
        InputModule input =StuScoreList.getInputModule();
        CountModule count =StuScoreList.getCountModule();
        PrintModule print =StuScoreList.getPrintModule();
        input.insert();
        count.countTotalScore();
        print.printStuInfo();
        //print.delete();
    }
}