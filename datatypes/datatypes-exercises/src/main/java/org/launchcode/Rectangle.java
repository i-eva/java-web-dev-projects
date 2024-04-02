package org.launchcode;
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner lenInput;
        lenInput = new Scanner(System.in);
        System.out.println("I can calculate the area of a rectangle for you.");
        System.out.println("Input the length of your rectangle, please: ");
        double length = lenInput.nextDouble();

        Scanner widInput;
        widInput = new Scanner(System.in);
        System.out.println("Input the width of your rectangle, please: ");
        double width = widInput.nextDouble();

        double area = length*width;

        System.out.println("The area of the rectangle is "+area);
    }
}
