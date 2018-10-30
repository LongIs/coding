package com.loong.principle.demeter;

public class Boss {
    public void checkNumber(TeamLeader teamLeader){
        teamLeader.commandCheckNumber(teamLeader);
    }
}
