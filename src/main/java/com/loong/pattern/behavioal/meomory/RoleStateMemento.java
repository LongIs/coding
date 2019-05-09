package com.loong.pattern.behavioal.meomory;

/**
 * @author xiongtaolong
 * @date 2019-05-09 20:58
 * 存储类
 */
public class RoleStateMemento {
    private int vit;
    private int atk;

    public RoleStateMemento(int vit, int atk){
        this.vit=vit;
        this.atk=atk;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }
}
