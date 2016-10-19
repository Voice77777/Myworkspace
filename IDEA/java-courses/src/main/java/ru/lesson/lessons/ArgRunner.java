package ru.lesson.lessons;

/**
 * Created by voice_arniman on 11.10.16.
 */
public class ArgRunner {

    public static void main(String[] args) {
        System.out.println("Calculate...");
        if (args.length == 2) {
            int first = Integer.valueOf(arg[0]);
            int second = Integer.valueOf(arg[1]);
            Calculator calc = new Calculator();
            calc.add(first, second);
            System.out.println("Sum :" + calc.getResult());
        }
        else {
            System.out.println("Enter two parameter: ");
        }
    }
}
