/**
 * @author Vu Nguyen
 * CSC 201-004N
 * Assignment 3
 * Problem 3.16
 * (Random point) Write a program that displays a random coordinate in a rectangle.
 * The rectangle is centered at (0, 0) with width 100 and height 200.
 */
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int width = (int)((Math.random() * (50 + 50)) -50);
        int height = (int)((Math.random() * (100 + 100)) -100);

        System.out.println("Random coordinate in rectangle centered at (0,0)");
        System.out.println(
                "with width 100 and height 200: (" + width + ", " + height + ")");
    }
}