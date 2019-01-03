package com.ko00.design.principle.dependenceinversion;

/**
 * @author ko00
 * @title-依赖倒置
 */
public class Test {
    public static void main(String[] args) {
        Ko00 ko00 = new Ko00();
        ko00.studyIMCourse(new JavaCourse());
        ko00.studyIMCourse(new FECourse());
    }
}
