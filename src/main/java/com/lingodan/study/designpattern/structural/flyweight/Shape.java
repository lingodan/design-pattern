package com.lingodan.study.designpattern.structural.flyweight;

public interface Shape {

    /*
    享元模式主要视为了减少对象的数量，以减少内存占用和提高性能。
    享元模式尝试重用现有的同类对象，如果没有找到匹配的对象，则创建新对象。
     */

    /*
    享元的英文是flyweight,是一个来自体育方面的专业用语，在拳击、摔跤和举重比赛中特指最轻量级的级别。把这个单词移植到软件工程中，也是用来特别小的对象，即细粒度的对象。
    享元 == 共享元对象，也就是共享细粒度对象。

    lang包下的Integer类，对于经常使用-128 - 127 范围的Integer对象，当类一被加载时就被创建了，并保存在cache数组中，一旦程序调用了valueOf方法，
    如果i的值是在-128到127之间就直接在cache缓存数组去获得Integer对象而不是去创建一个新的对象。

    车牌拍卖失败哦，90800假期没有出去
     */

    void draw();

}
