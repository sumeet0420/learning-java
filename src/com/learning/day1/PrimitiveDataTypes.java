package com.learning.day1;

public class PrimitiveDataTypes {

    public static void main(String[] args) {
        //Primitive Data Types - 8 Types
        //byte, char, int, float, long, boolean, short, double

        int a = 100; //Max 2^31-1 for positive and negative
        long b = 100; //Max 2^64-1 for positive and negative numbers
        float c = 100.0f; //Float needs to be ended with f
        double d = 100.90; //Decimal
        char e = 'a'; // char is always enclosed in single quotes
        boolean flag = true; //Boolean has only two values; either tre or either false
        boolean flag1 = false; //Boolean has only two values; either tre or either false
        byte g = 1;
        short f = 100;
        //int y = long x = 10990; int y = 9099; int z = x +
        int x = 100;
        int y = 50;
        //Arithmatic Operations - Addition
        int sum = x + y;
        System.out.println("sum: " + sum); //Concatenation
        //Arithmatic Operations - Difference
        int diff = x - y;
        System.out.println("diff: " + diff);
        //Arithmatic Operations - Multiplication
        int mul = x * y;
        System.out.println("mul: " + mul);
        //Arithmatic Operations - Division
        int div = x / y;
        System.out.println("div: " + div);
        //Arithmatic Operations - Modulus -> Remainder
        int rem = x % y;
        System.out.println("rem: " + rem);

        int div_rev = y /x;
        System.out.println("div_rev: " + div_rev);

        double div_rev_2 = 3/2.0; //Upcasting So, Answer will be 1.5
        System.out.println("div_rev_double: " + div_rev_2);

        double div_rev_3 = 3/2; //Upcasting So, Answer will be 1 -> 1.0
        System.out.println("div_rev_double_3: " + div_rev_3);

        //Not work as a concatenation, but as an expression
        System.out.println(1+2); //Expression
        System.out.println("sum: "+1+2); //Concatenation
        System.out.println("sum: "+(1+a)); //Concatenation and expression
        //Will throw Compilation error
        //System.out.println("sum: "+(1+ q)); //Concatenation and expression


    }

}
