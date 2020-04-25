package com.lingodan.study.designpattern.structural.adapter;

public interface MediaPlayer {

    /*
    适配器模式就是作为两个不兼容接口之间的桥梁，它结合了两种独立接口的功能。
    通常是用将一个类的接口转换成客户希望的另外一个接口。
     */

    /*
    JDK 源码的IO 功能
    mybatis源码日志模块

     */

    /*
    1.使用继承方法实现
    2.使用组合方法实现
    3.定义多个接口实现
     */

    public void play(String audioType, String fileName);

}
