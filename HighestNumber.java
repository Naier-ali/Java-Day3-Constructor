package com.day3;

public class HighestNumber {
    public static void main(String[] args) {
        int num1 = 11;
        int num2 = 10;
        int num3 = 9;

       int highest = findHighestNumber(num1, num2, num3);
        System.out.println("The highest number is: " + highest);
    }

    public static int findHighestNumber(int num1, int num2, int num3) {
        if (num1 >= num2 && num1 >= num3) {
            return num1;
        } else if (num2 >= num1 && num2 >= num3) {
            return num2;
        } else {
            return num3;
        }
    }
}
