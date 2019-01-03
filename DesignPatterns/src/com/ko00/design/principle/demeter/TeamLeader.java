package com.ko00.design.principle.demeter;

import java.util.ArrayList;

public class TeamLeader {

    void  reportCourseCount(){
        ArrayList<Course> courses = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courses.add(new Course());
        }
        System.out.println("课程总共"+courses.size());
    }
}
