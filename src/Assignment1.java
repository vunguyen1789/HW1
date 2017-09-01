/**
 * @author Vu Nguyen
 * CSC 201-004N
 * Assignment 1
 * Problem 1.9
 * (Area and perimeter of a rectangle) Write a program that displays the area and
 * perimeter of a rectangle with the width of 4.5 and height of 7.9 using the following
 * formula:
 * area = width * height
 */
import java.text.DecimalFormat;
public class Assignment1 {

    public static void main (String[] args) {
        double height = 7.9;
        double width = 4.5;
        double area = height * width;
        double perimeter = (height + width) * 2;
        DecimalFormat df = new DecimalFormat( "0.0");
        System.out.println("Area = " + df.format(area));
        System.out.println("Perimeter = " + df.format (perimeter));


    }
}
