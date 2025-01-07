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

    public static String numberToWords(int n) {
        if (n < 0) {
            return "Invalid Value";
        }

        StringBuilder result = new StringBuilder(); // Sonuçları biriktirmek için StringBuilder kullanıyoruz
        String numberAsString = String.valueOf(n);

        for (int i = 0; i < numberAsString.length(); i++) {
            char digitalChar = numberAsString.charAt(i);
            switch (digitalChar) {
                case '0' -> result.append("Zero ");
                case '1' -> result.append("One ");
                case '2' -> result.append("Two ");
                case '3' -> result.append("Three ");
                case '4' -> result.append("Four ");
                case '5' -> result.append("Five ");
                case '6' -> result.append("Six ");
                case '7' -> result.append("Seven ");
                case '8' -> result.append("Eight ");
                case '9' -> result.append("Nine ");
            }
        }

        return result.toString().trim(); // Sonucu string olarak döndür, fazla boşlukları kaldır
    }


}
