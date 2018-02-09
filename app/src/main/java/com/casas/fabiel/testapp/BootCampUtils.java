package com.casas.fabiel.testapp;

public class BootCampUtils {

    //    Multiplos
    public static boolean oddNumber(int number) {
        return !pairNumber(number);
    }

    public static boolean pairNumber(int number) {
        return isMultipleNumber(number, 2);
    }

    public static boolean isMultipleNumber(int number, int multiple) {
        return number % multiple == 0;
    }

    //    Bisiesto
    public static boolean isLeapYear(int year) {
        if (isMultipleNumber(year, 100)) {
            return isMultipleNumber(year, 400);
        }
        return isMultipleNumber(year, 4);
    }

    public static int maxNumber(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static double sequenceOne(double n) {
        if (n == 1) {
            return n;
        }
        return (1 / n) + sequenceOne(n - 1);
    }

    public static double sequenceTwo(double n) {
        double result = 1;
        for (double i = 3; i <= n; i = i + 2) {
            result += i / (i - 1);
        }
        return result;
    }

    //    Triangulo valido
    public static boolean validTriangle(int a, int b, int c) {
        int max = maxNumber(a, b, c);
        if (a == b && b == c) {
            return false;
        } else if (max == a) {
            return b + c > max;
        } else if (max == b) {
            return a + c > max;
        } else {
            return a + b > max;
        }
    }

    //    Frases Danzantes
    public static String dancingText(String text) {
        String resultText = "";
        String[] words = text.split(" ");
        for (String word : words) {
            resultText += capitalizeWord(word) + " ";
        }
        return resultText.trim();
    }

    private static String capitalizeWord(String word) {
        if (word.length() > 1) {
            return word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
        }
        return word.toUpperCase();
    }

}
