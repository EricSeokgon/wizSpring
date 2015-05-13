package com.hadeslee.ex6;

/**
 * Project: wizSpring
 * FileName: MainClass2
 * Date: 2015-05-13
 * Time: 오후 2:06
 * Author: Hadeslee
 * Note:
 * To change this template use File | Settings | File Templates.
 */
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfig.class);

        Student student1 = ctx.getBean("student1", Student.class);
        System.out.println("이름 : " + student1.getName());
        System.out.println("나이 : " + student1.getAge());
        System.out.println("취미 : " + student1.getHobbys());
        System.out.println("신장 : " + student1.getHeight());
        System.out.println("몸무게 : " + student1.getWeight());

        Student student2 = ctx.getBean("student2", Student.class);
        System.out.println("이름 : " + student2.getName());
        System.out.println("나이 : " + student2.getAge());
        System.out.println("취미 : " + student2.getHobbys());
        System.out.println("신장 : " + student2.getHeight());
        System.out.println("몸무게 : " + student2.getWeight());

        ctx.close();
    }

}
