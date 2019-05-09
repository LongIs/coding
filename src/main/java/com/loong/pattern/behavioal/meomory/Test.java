package com.loong.pattern.behavioal.meomory;

/**
 * @author xiongtaolong
 * @date 2019-05-09 20:59
 */
public class Test {
    public static void main(String[] args) {
        GameRole liaowp=new GameRole();
        liaowp.init();
        liaowp.show();
        RoleStateMange adminMange=new RoleStateMange();
        adminMange.setMemento(liaowp.saveMemento());//保存
        liaowp.fightBoss();
        liaowp.show();
        liaowp.recove(adminMange.getMemento());
        liaowp.show();
    }
}
