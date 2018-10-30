package com.loong.principle.demeter;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {
    public void commandCheckNumber(TeamLeader teamLeader) {
        List<Coures> list = new ArrayList<Coures>();
        System.out.println(list.size());
    }
}
