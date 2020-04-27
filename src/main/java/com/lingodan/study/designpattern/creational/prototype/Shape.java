package com.lingodan.study.designpattern.creational.prototype;

public abstract class Shape implements Cloneable {

    /*
    用于创建重复的对象，同时又能保证性能，这种类型的设计模式属于创建模式，它提供了一种创建对象的最佳方法、
    这种方法是实现了一个原型接口，该接口用于创建当前对象的克隆，当创建对象的代价比较大时，则采用这种模式。

     */

    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }


}
