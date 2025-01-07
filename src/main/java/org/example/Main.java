package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while(number != 0) {
            reversedNumber = reversedNumber * 10 + number % 10;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    public static boolean isPerfectNumber (int number) {
        if(number <= 1) {
            return false;
        }
        int sum = 1;
        for (int i = 2; i < number/2; i++) { //Döngü sadece number / 2'ye kadar yapılır çünkü bir sayının bölenlerinin en büyüğü yarısından fazlası olamaz.
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

}
