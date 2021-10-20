package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many marks did you get in this paper?");
        int totalMarks = input.nextInt();
        int maximumMarks = 50;


        double Percentage = (double) totalMarks / maximumMarks * 100;

        if (Percentage < 40) {
            System.out.println("This mark gets a grade U!");


        } else {
            if (Percentage > 40 && Percentage <= 49) {
                System.out.println("This student gets a grade E");

            } else {
                if (Percentage >= 50 && Percentage <= 59) {
                    System.out.println("This student gets a grade D");
                } else {

                    if (Percentage >= 60 && Percentage <= 69) {
                        System.out.println("This student gets a grade C");
                    } else {
                        if (Percentage >= 70 && Percentage <= 79) {
                            System.out.println("This student gets a grade B");
                        } else {
                            if (Percentage >= 80 && Percentage <= 100) {
                                System.out.println("This student gets a grade A");
                            } else {
                                if (Percentage > 100) {
                                    System.out.println("That is an invalid percentage, you can't get more than the maximum mark, stupid idiot!");
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}