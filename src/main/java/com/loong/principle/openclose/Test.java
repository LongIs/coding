package com.loong.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(99,"语文",12.2);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse)iCourse;

        /**/
        System.out.println("课程名:"+javaCourse.getName()+",课程id:"+javaCourse.getId()+
                ",课程原价:"+javaCourse.getPrice()+",课程打折价:"+javaCourse.getSellPrice());
    }
}
