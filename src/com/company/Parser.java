package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Parser {
    public static String regex = "(.*)[Сс]трад(.*)";
    void parse (File file) {
        try {
            ArrayList <String> words = new ArrayList<>();
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String [] scanWords = scanner.nextLine().split("[ ,.?!]");
                for (String scanWord : scanWords) {
                    if ( scanWord.matches(regex)) {
                        words.add(scanWord);
                    }
                }
            }
            int count = 0;
            for (String word : words) {
                System.out.println(word);
                count++;
            }
            System.out.println(count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
