/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exams;

/**
 *
 * @author ochie
 */



import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10); // Generate a random number between 0 and 9
        int number2 = (int) (Math.random() * 10); // Generate another random number between 0 and 9

        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        System.out.println("What is " + number1 + " - " + number2 + "?");

        Scanner scanner = new Scanner(System.in);
        int studentAnswer = scanner.nextInt();

        if (studentAnswer == (number1 - number2)) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect. The correct answer is " + (number1 - number2) + ".");
        }
    }
}