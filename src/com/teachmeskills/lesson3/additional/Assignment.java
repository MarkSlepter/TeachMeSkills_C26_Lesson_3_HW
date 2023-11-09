package com.teachmeskills.lesson3.additional;

public class Assignment {

    public static void main(String[] args) {
        int n = 10;
        generateFibonacci(n);
    }
    static void generateFibonacci(int n) {
        int firstTerm = 0, secondTerm = 1;
        System.out.println("First " + n + " of the Fibonacci numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.println(firstTerm + "; ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }

}
