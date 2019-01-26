package com.joofont.springboot.thread;

/**
 * @author cui jun on 2019/1/23.
 * @version 1.0
 */
public class AdugenThread extends Thread {

    private Integer amount;

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public void run() {
        System.out.println("波动拳第");
    }

}
