package com.hadeslee.ex3;

/**
 * Project: wizSpring
 * FileName: MyCalculator
 * Date: 2015-05-13
 * Time: 오전 9:46
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MyCalculator {

    Calculator calculator;
    private int firstNum;
    private int secondNum;

    public MyCalculator() {

    }

    public void add() {
        calculator.addition(firstNum, secondNum);
    }

    public void sub() {
        calculator.subtraction(firstNum, secondNum);
    }

    public void mul() {
        calculator.multiplication(firstNum, secondNum);
    }

    public void div() {
        calculator.division(firstNum, secondNum);
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

}
