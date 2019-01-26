package com.joofont.springboot.thread;

import java.util.concurrent.Callable;

/**
 * @author cui jun on 2019/1/23.
 * @version 1.0
 */
public class Whata implements Callable {

    private Hero h1;
    private Hero h2;

    public Whata(Hero h1, Hero h2){
        this.h1 = h1;
        this.h2 = h2;
    }

    @Override
    public Object call() throws Exception {
        while(!h2.isDead()){
            h1.attackHero(h2);
        }
        return null;
    }

}
