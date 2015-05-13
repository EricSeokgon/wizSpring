package com.hadeslee.ex3;

/**
 * Project: wizSpring
 * FileName: Calculator
 * Date: 2015-05-13
 * Time: 오전 9:47
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {

    public void addition(int f, int s) {
        System.out.println("addition()");
        int result = f + s;
        System.out.println(f + " + " + s + " = " + result);
    }

    public void subtraction(int f, int s) {
        System.out.println("subtraction()");
        int result = f - s;
        System.out.println(f + " - " + s + " = " + result);
    }

    public void multiplication(int f, int s) {
        System.out.println("multiplication()");
        int result = f * s;
        System.out.println(f + " * " + s + " = " + result);
    }

    public void division(int f, int s) {
        System.out.println("division()");
        int result = f / s;
        System.out.println(f + " / " + s + " = " + result);
    }
}
