package com.company;

public class SevenSecThread implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (true) {
            try {
                Thread.sleep(7000L);
                System.out.println("The message of " + (count + 7) + " secons left");
                count =count+7;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}