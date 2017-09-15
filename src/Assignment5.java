/**
 * @author Vu Nguyen
 * CSC 201-004N
 * Assignment 5
 * Problem 5.10
 * 5.10 (Find numbers divisible by 5 and 6) Write a program that displays all the numbers 
 * from 100 to 1,000, ten per line, that are divisible by 5 and 6. 
 * Numbers are separated by exactly one space.
 */
import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {

        int numCount = 1;
        for (int i = 100; i <= 1000; i++) {

            if (i % 5 == 0 && i % 6 == 0)
                System.out.print((numCount++ % 10 != 0) ? i + " " : i + "\n");
        }
    }
}