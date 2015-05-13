package com.hadeslee.ex6;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Project: wizSpring
 * FileName: MainClass
 * Date: 2015-05-13
 * Time: 오후 1:24
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
public class MainClass {
    public static void main(String[] args) {
        String configLocation1 = "classpath:applicationCTX.xml";
        String configLocation2 = "classpath:applicationCTX1.xml";
        AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation1, configLocation2);

        Student student1 = ctx.getBean("student1", Student.class);
        System.out.println(student1.getName()); //홍길동
        System.out.println(student1.getHobbys());   //수영, 요리

        StudentInfo studentInfo = ctx.getBean("sutudentInfo1", StudentInfo.class);
        Student student2 = studentInfo.getStudent();    // student1 == student2
        System.out.println(student2.getName()); //홍길동
        System.out.println(student2.getHobbys());   //수영, 요리

        if (student1.equals(student2)) {
            System.out.println("student1 == student2");
        }

        Student student3 = ctx.getBean("student3", Student.class);
        System.out.println(student3.getName());

        if (student1.equals(student3)) {
            System.out.println("student1 == student3");
        } else {
            System.out.println("student1 != student3");
        }

        Family family = ctx.getBean("family", Family.class);
        System.out.println(family.getPapaName());
        System.out.println(family.getMamiName());
        System.out.println(family.getPapaName());
        System.out.println(family.getSisterName());

        ctx.close();

    }
}
