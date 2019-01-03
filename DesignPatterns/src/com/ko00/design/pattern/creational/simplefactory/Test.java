package com.ko00.design.pattern.creational.simplefactory;

public class Test {
    public static void main(String[] args) {
//        VideoFactory.getVideo("java").produce();
        VideoFactory.getVideo(PythonVideo.class).produce();
    }
}
