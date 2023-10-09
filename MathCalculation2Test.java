package com.project.javatestingproject1;

import static org.junit.jupiter.api.Assertions.assertEquals; //packages is taken which useful to run the test

import org.junit.jupiter.api.Test;

public class MathCalculation2Test  // test main class file
{

    @Test //This annotation is used to run the test
    public void testCalculateSimpleInterest() //Method to find simple interest
    
    {
        //we can create a test case for calculating simple interest
        double principalAmount = 1000;
        double interestRate = 8;
        double expectedInterest = 80.0;

        //in this we can calculate the actual interest using the method
        double actualInterest = MathCalculation2.calculateSimpleInterest(principalAmount, interestRate, 0);
        
        //it compare the actual result with the expected result values given from the method
        assertEquals(expectedInterest, actualInterest, 0.01);
        System.out.println("This test is running to find simple interest ");
    }

    @Test //This annotation is used to run the test
    public void testCalculateRectangleArea() //Method to find area of rectangle
    {
        //we can create a test case for calculating the area of a rectangle
        double length = 6.0;
        double width = 10.0;
        double expectedArea = 60.0;

        //in this we calculate the actual area using the method
        double actualArea = MathCalculation2.calculateRectangleArea(length, width);

        //it compare the actual result with the expected result values given from the method
        assertEquals(expectedArea, actualArea, 0.01);
        System.out.println("This test is running for finding area of rectangle ");
    }

    @Test //This annotation is used to run the test
    public void testCalculateCircleCircumference() //Method to find circle circumferences
    {
        //we can create a test case for calculating the circumference of a circle
        double radius = 5.0;
        double expectedCircumference = 31.42 ;

        //in this we calculate the actual circumference using the method
        double actualCircumference = MathCalculation2.calculateCircleCircumference(radius);

        //it compare the actual result with the expected result values given from the method 
        assertEquals(expectedCircumference, actualCircumference, 0.01);
        System.out.println("This test is running for circumference of circle  ");
    }
}
