package com.company;

import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class

class MyClass {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Type a number:");
        int x = myObj.nextInt(); // Read user input

        System.out.println("Type another number:");
        int y = myObj.nextInt(); // Read user input

        int sum = x + y;  // Calculate the sum of x + y
        System.out.println("Sum is: " + sum); // Print the sum

    }

}

class UrClass{
    public static void main(String[] args){
        int[] intArray = new int[]{1,2,3,4,5,6,7,8,9,10 };
        System.out.println(intArray[1]+intArray[2]);
        
    }

}
