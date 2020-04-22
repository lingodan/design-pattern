package com.lingodan.study.designpattern.creational.singleton;

import java.util.stream.IntStream;

public class TestUtils {

    public void test() {
        IntStream.rangeClosed(1, 200).parallel().forEach(System.out::println);
    }

}
