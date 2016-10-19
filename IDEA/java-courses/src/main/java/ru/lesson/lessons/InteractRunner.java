package ru.lesson.lessons;

import java.util.Scanner;

/**
 * Created by voice_arniman on 11.10.16.
 */
public class InteractRunner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")){
                System.out.println("Enter first arg: ");
                String first = reader.next();
                System.out.println("Enter second arg: ");
                String second = reader.next();
                calc.add(Integer.valueOf(first), Integer.valueOf(second));
                System.out.println("Result: " + calc.getResult());
                calc.cleanResult();
                System.out.println("Exit: y/n");
                exit = reader.next();

            }
        }
        finally {
            reader.close();
        }
    }
}
