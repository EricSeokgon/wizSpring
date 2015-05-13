package com.hadeslee.ex3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Project: wizSpring
 * FileName: MainClass
 * Date: 2015-05-13
 * Time: 오전 9:45
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {

        /*MyCalculator myCalculator = new MyCalculator();
        myCalculator.setCalculator(new Calculator());

        myCalculator.setFirstNum(10);
        myCalculator.setSecondNum(2);

        myCalculator.add();
        myCalculator.sub();
        myCalculator.mul();
        myCalculator.div();*/

        String configLocation = "classpath:applicationCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
        MyCalculator myCalculator = ctx.getBean("myCalculator", MyCalculator.class);

        myCalculator.add();
        myCalculator.sub();
        myCalculator.mul();
        myCalculator.div();
    }


}
