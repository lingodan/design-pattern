package com.lingodan.study.designpattern.creational.builder;

public class VegBurger extends Burger {

    @Override
    public float price() {
        return 0.25f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
