/**
 * @author Vu Nguyen
 * CSC 201-004N
 * Assignment 2
 * Problem 2.16
 * ((Geometry: area of a hexagon) Write a program that prompts the user to enter the
 * side of a hexagon and displays its area. The formula for computing the area of a
 * hexagon is
 * Area = (3/2)sqrt3*side^2
 */
import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        System.out.print("Please enter the size of the hexagon: ");
        Scanner scanner = new Scanner(System.in);
        double side = scanner.nextDouble();
        boolean WrongInput = true;
        System.out.println("Hexagon side: " + side);
        double area = Math.sqrt(3) * (side * side) * 1.5;
        System.out.println("Hexagon area: " + area);
        }
}
