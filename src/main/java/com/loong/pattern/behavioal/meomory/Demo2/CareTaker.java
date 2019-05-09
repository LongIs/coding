package com.loong.pattern.behavioal.meomory.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-09 21:17
 * 管理者角色：负责管理备忘录类，示例只保存了一个备忘录对象，可以通过设置栈保存多个对象
 *
 */
public class CareTaker {
    private EmpMemento memento;

    public EmpMemento getMemento() {
        return memento;
    }

    public void setMemento(EmpMemento memento) {
        this.memento = memento;
    }
}
