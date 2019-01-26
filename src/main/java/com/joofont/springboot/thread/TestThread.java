package com.joofont.springboot.thread;

/**
 * @author cui jun on 2019/1/23.
 * @version 1.0
 */
public class TestThread {

    public static void main(String[] args) throws Exception {

        // fixme: 死锁
//        String oneLock = new String("锁一");
//        String twoLock = new String("锁二");
//        String threeLock = new String("锁三");
//
//        new Thread() {
//            public void run(){
//                synchronized (oneLock) {
//                    System.out.println("占有锁一");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("尝试占有锁二");
//                    synchronized (twoLock) {
//                        System.out.println("占有锁二");
//                    }
//                }
//            }
//        }.start();
//
//        new Thread() {
//            public void run(){
//                synchronized (twoLock) {
//                    System.out.println("占有锁二");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("尝试占有锁三");
//                    synchronized (threeLock) {
//                        System.out.println("占有锁三");
//                    }
//                }
//            }
//        }.start();
//
//        new Thread() {
//            public void run(){
//                synchronized (threeLock) {
//                    System.out.println("占有锁三");
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                    System.out.println("尝试占有锁一");
//                    synchronized (oneLock) {
//                        System.out.println("占有锁一");
//                    }
//                }
//            }
//        }.start();

    }

}
