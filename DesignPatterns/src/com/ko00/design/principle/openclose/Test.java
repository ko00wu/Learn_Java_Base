package com.ko00.design.principle.openclose;


/**
 * @author ko00
 * @title  设计模式-开闭原则
 */
public class Test {
    public static void main(String[] args) {
        JavaDiscountCourse javaDiscountCourse = new JavaDiscountCourse(1, "Java课程", 340.0);
        System.out.println("课程：" + javaDiscountCourse.getName() + "价格：" + javaDiscountCourse.getPrice() + " 原价格：" + javaDiscountCourse.getOriginPrice());
    }
}
