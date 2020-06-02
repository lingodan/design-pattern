package com.lingodan.study.designpattern.behavioral.iterator;

/**
 * @author lingodan
 * Created on 2020/6/2 22:39.
 */
public class IteratorDemo {
    /**
     * 顺序访问集合中的数据，无需知道其内部结构与实现
     */

    public static void main(String[] args) {

        NameRepository repo = new NameRepository();
        Iterator iterator = repo.getIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
