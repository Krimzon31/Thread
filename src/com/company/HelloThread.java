package com.company;

public class HelloThread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            new HelloThread().start();
            System.out.println(getName());
        }
    }

    public static void main(String args[]) {
        (new HelloThread()).start();
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }

}
