package com.loong.pattern.behavioal.meomory.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-09 21:18
 */
public class Test {
    public static void main(String[] args) {
        CareTaker taker=new CareTaker();

        Emp emp=new Emp("张三",18,2000);
        System.out.println("第一次打印对象："+emp.getName()+"----"+emp.getAge()+"---"+emp.getSalary());

        //进行备忘
        taker.setMemento(emp.memento());

        emp.setAge(20);
        emp.setSalary(3000);
        System.out.println("第二次打印对象："+emp.getName()+"----"+emp.getAge()+"---"+emp.getSalary());

        //数据恢复
        emp.recovery(taker.getMemento());
        System.out.println("第三次打印对象："+emp.getName()+"----"+emp.getAge()+"---"+emp.getSalary());

    }
}
