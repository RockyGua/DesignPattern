package com.rocky.strategy;

/**
 * Created by Rocky on 2016/2/20.
 */
public class Artillery implements Shooter {

    public void shoot(String strategy) {
        System.out.println("We are shooting with artillery by " + strategy);
    }
}
