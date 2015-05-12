package com.hadeslee.ex;

/**
 * Project: wizSpring
 * FileName: MainClass
 * Date: 2015-05-12
 * Time: 오후 4:16
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {
        Calculation calculation = new Calculation();
        calculation.setFirstNum(10);
        calculation.setSecondNum(2);

        calculation.add();
        calculation.sub();
        calculation.mult();
        calculation.div();
    }
}
