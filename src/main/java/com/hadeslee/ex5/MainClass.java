package com.hadeslee.ex5;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Project: wizSpring
 * FileName: MainClass
 * Date: 2015-05-13
 * Time: 오전 11:39
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {

        String configLocation = "classpath:applicationCTX.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
        Pencil pencil = ctx.getBean("pencil", Pencil.class);
        pencil.use();

        ctx.close();
    }
}

