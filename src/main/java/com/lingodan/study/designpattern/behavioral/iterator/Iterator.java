package com.lingodan.study.designpattern.behavioral.iterator;

/**
 * @author lingodan
 * Created on 2020/6/2 22:42.
 */
public interface Iterator {
    /**
     * 是否还有下一个元素
     * @return 存在返回True，不存在返回false
     */
    public boolean hasNext();

    /**
     * 返回下一个元素
     * @return
     */
    public Object next();

}
