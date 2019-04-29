package com.loong.pattern.structural.adapter;

import com.loong.pattern.structural.adapter.AC220;
import com.loong.pattern.structural.adapter.DC5;

public class PowerAdapter implements DC5 {
    AC220 ac220 = new AC220();

    public int result5() {
        int result = ac220.result220();
        return result/44;
    }
}
