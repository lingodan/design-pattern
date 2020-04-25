package com.lingodan.study.designpattern.structural.facade;

public interface Shape {
    /*
    使用外观模式可以隐藏系统的复杂性，并向客户端提供一个客户端可以访问系统的接口。它向现有的系统添加一个接口，来隐藏系统的复杂性。
    为子系统的一组接口提供一个一致的界面，外观模式定义了一个高层接口，这个接口使得这一子系统更容易使用。
     */
    void draw();
}
