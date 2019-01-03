package com.ko00.design.principle.demeter;

/**
 * @author ko00
 * @title  迪米特法则
 */
public class Test {
    public static void main(String[] args) {
        new Boss(){}.commandTeamLeader(new TeamLeader());
    }
}
