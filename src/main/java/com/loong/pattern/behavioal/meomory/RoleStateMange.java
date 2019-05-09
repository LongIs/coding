package com.loong.pattern.behavioal.meomory;

/**
 * @author xiongtaolong
 * @date 2019-05-09 20:58
 * 游戏角色管理类
 */
public class RoleStateMange {
    private RoleStateMemento memento;

    public RoleStateMemento getMemento() {
        return memento;
    }

    public void setMemento(RoleStateMemento memento) {
        this.memento = memento;
    }
}
