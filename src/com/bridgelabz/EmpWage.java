package com.bridgelabz;
import java.util.*;
public class EmpWage {
    public static void main(String[] args) {


        System.out.println("Start the program");
        //variables
        final int FULL_TIME = 1;
        final int WAGE_PER_HR = 20;
        int empType = (int) (Math.random() * 100) % 2;
        int workingHours = 0;

        if (empType == FULL_TIME) {

            System.out.println("Employee is Present");
            workingHours = 8;

        } else
        {
            System.out.println("Employee is Absent");
        }
        int wage = workingHours * WAGE_PER_HR;
        System.out.println("Employee Daily Wage is " + wage);

    }
}
