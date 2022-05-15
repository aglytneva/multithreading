package com.company;

public class FiveSecThread implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                Thread.sleep(5000L);
                System.out.println("The message of " + (count + 5) + " secons left");
                count =count+5;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
