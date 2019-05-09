package com.loong.pattern.behavioal.meomory.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-09 21:16
 * 备忘录角色
 *
 */
public class EmpMemento {
    private String name;
    private int age;
    private int salary;

    public EmpMemento(Emp emp){
        this.name=emp.getName();
        this.age=emp.getAge();
        this.salary=emp.getSalary();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
