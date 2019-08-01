package org.loong.lambda.Chapter2;

import java.util.*;
import java.util.stream.Collectors;

/**
 * 学生 对象
 */
class Student {
    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    /**
     * 性别
     */
    private Gender gender;

    /**
     * 班级
     */
    private Grade grade;

    public Student(String name, int age, Gender gender, Grade grade) {
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.grade = grade;
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

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "[name=" + name + ", age=" + age + ", gender=" + gender
                + ", grade=" + grade + "]";
    }

}

/**
 * 性别
 */
enum Gender {
    MALE, FEMALE
}

/**
 * 班级
 */
enum Grade {
    ONE, TWO, THREE, FOUR;
}

public class CollectDemo {
    public static void main(String[] args) {
        // 测试数据
        List<Student> students = Arrays.asList(
                new Student("小明", 10, Gender.MALE, Grade.ONE),
                new Student("大明", 9, Gender.MALE, Grade.THREE),
                new Student("小白", 8, Gender.FEMALE, Grade.TWO),
                new Student("小黑", 13, Gender.FEMALE, Grade.FOUR),
                new Student("小红", 7, Gender.FEMALE, Grade.THREE),
                new Student("小黄", 13, Gender.MALE, Grade.ONE),
                new Student("小青", 13, Gender.FEMALE, Grade.THREE),
                new Student("小紫", 9, Gender.FEMALE, Grade.TWO),
                new Student("小王", 6, Gender.MALE, Grade.ONE),
                new Student("小李", 6, Gender.MALE, Grade.ONE),
                new Student("小马", 14, Gender.FEMALE, Grade.FOUR),
                new Student("小刘", 13, Gender.MALE, Grade.FOUR));

        //返回list或set
        List<Integer> collect = students.stream().map(Student::getAge).collect(Collectors.toList());
        Set<Integer> collect1 = students.stream().map(Student::getAge).collect(Collectors.toSet());

        //返回指定的
        TreeSet<Integer> collect2 = students.stream().map(Student::getAge).
                collect(Collectors.toCollection(TreeSet::new));

        //统计所有年龄
        students.stream().collect(Collectors.summarizingInt(Student::getAge));

        //分块
        Map<Boolean, List<Student>> collect3 = students.stream().
                collect(Collectors.partitioningBy(s -> s.getGender() == Gender.MALE));

        //分组
        Map<Grade, List<Student>> collect4 = students.stream().collect(Collectors.groupingBy(Student::getGrade));

        //得到所有班级学生个数(也有平均值等)
        Map<Grade, Long> collect5 = students.stream().
                collect(Collectors.groupingBy(Student::getGrade, Collectors.counting()));

    }
}
