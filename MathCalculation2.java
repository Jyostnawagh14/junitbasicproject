package com.project.javatestingproject1;

//Create a maven project to implement testing on methods like 
//
//a). find simple interest for the principle amount given with 8% interest per annum
//
//b). Find area of rectangle.
//
//c). Find circumference of circle

public class MathCalculation2 //class name
{

    public static double calculateSimpleInterest(double principalAmount, double interestRate, int totaltimeinyears) //This method is used to calculate SI
    {
        return (principalAmount * interestRate) / 100; //SI= (pa * rate of interest)/100
    }

    public static double calculateRectangleArea(double length, double width) //This method is used to calculate the area of rectangle
    {
        return length * width; //Area of rectangle= (l*w)
    }

    public static double calculateCircleCircumference(double radius) //This method is used to calculate the circumference of circle
    {
        return 2 * Math.PI * radius;  //Circumference of circle= (2*math.pi*r)
    }
    
}


