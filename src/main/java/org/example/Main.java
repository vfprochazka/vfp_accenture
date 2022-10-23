package org.example;

public class Main {

    static final boolean debug = false;

    /*
       1.	Write a program in Python or Java that counts backwards from 100 to 1
       and prints:
        “Agile” if the number is divisible by 5,
        “Software” if the number is divisible by 3,
        “Testing” if the number is divisible by both,
        or prints just the number if none of those cases are true.
     */
    public static void main(String[] args) {
        for (int i = 100; i > 0; i--) {
            printOutput(i);
        }
    }

    static public void printOutput(int input) {
        if (debug) {
            System.out.print("value: " + String.valueOf(input) + " ");
        }
        int remainder5 = input % 5;
        int remainder3 = input % 3;

        if ((remainder5 == 0) && (remainder3 == 0)) {
            System.out.println("Testing");
        } else if (remainder5 == 0) {
            System.out.println("Agile");
        } else if (remainder3 == 0) {
            System.out.println("Software");
        } else {
            System.out.println(String.valueOf(input));
        }
    }
}
