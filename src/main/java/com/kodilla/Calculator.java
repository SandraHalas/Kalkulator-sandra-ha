package com.kodilla;

public class Calculator{

public void substractAFromB(double a, double b) {
        double result =  a - b;
        System.out.println("wynik odejmowania " + result);
        }

public void addAToB(double a, double b) {
        double result = a + b;
        System.out.println("wynik dodawania: " + result);
        }

public static void main(String[] args) {

        Calculator simpleCalculator = new Calculator();
        simpleCalculator.substractAFromB(5.15 , 5.00);
    }
        }