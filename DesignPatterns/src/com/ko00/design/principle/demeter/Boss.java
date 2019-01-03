package com.ko00.design.principle.demeter;

public class Boss {

    void commandTeamLeader(TeamLeader teamLeader){
        teamLeader.reportCourseCount();
    }
}
