package com.company;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        // write your code here
        OneSecThread oneSecThread = new OneSecThread();
        FiveSecThread fiveSecThread = new FiveSecThread();
        SevenSecThread sevenSecThread = new SevenSecThread();

        new Thread(oneSecThread).start();
        new Thread(fiveSecThread).start();
        new Thread(sevenSecThread).start();

    }
}
