package org.launchcode;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner radInput;
        radInput = new Scanner(System.in);
        System.out.println("Input the radius of a circle: ");
        double radius = radInput.nextDouble();
        double area = Circle.getArea(radius);
        System.out.println("The circle's area is: " + area);
    }

}
