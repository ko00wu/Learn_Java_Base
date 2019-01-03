package com.ko00.design.pattern.creational.simplefactory;

public class VideoFactory {

    public static Video getVideo(String type) {
        if (type == "java") {
            return new JavaVideo();
        } else if (type == "python") {
            return new PythonVideo();
        }
        return null;
    }

    public static Video getVideo(Class c) {
        Video video = null;
        try {
            video = (Video) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return video;
    }

}
