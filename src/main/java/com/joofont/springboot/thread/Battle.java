package com.joofont.springboot.thread;

/**
 * @author cui jun on 2019/1/23.
 * @version 1.0
 */
public class Battle implements Runnable {

    @Override
    public void run() {
        for(int i=1;i<=3;i++) {
            System.out.println("波动拳第"+i+"发");
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
