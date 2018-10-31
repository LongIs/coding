package com.loong.pattern.creational.builder;

/**
 * @description:
 * @author: TaoLong
 * @create: 2018/10/30 21:40
 **/
public class Coures {
    private String courseName;
    private String coursePPT;
    private String courseVideo;
    private String courseArticle;
    private String courseQA;


    public Coures(CourseBuilder courseBuilder){
        this.courseName = courseBuilder.courseName;
        this.coursePPT = courseBuilder.coursePPT;
        this.courseVideo = courseBuilder.courseVideo;
        this.courseArticle = courseBuilder.courseArticle;
        this.courseQA = courseBuilder.courseQA;
    }

    public static class CourseBuilder{
        private String courseName;
        private String coursePPT;
        private String courseVideo;
        private String courseArticle;
        private String courseQA;


        public CourseBuilder courseName(String courseName){
            this.courseName = courseName;
            return this;
        }

        public CourseBuilder coursePPT(String coursePPT){
            this.coursePPT = coursePPT;
            return this;
        }

        public CourseBuilder courseVideo(String courseVideo){
            this.courseVideo = courseVideo;
            return this;
        }

        public CourseBuilder courseArticle(String courseArticle){
            this.courseArticle = courseArticle;
            return this;
        }

        public CourseBuilder courseQA(String courseQA){
            this.courseQA = courseQA;
            return this;
        }

        public Coures build(){
            return new Coures(this);
        }

        @Override
        public String toString() {
            return "CourseBuilder{" +
                    "courseName='" + courseName + '\'' +
                    ", coursePPT='" + coursePPT + '\'' +
                    ", courseVideo='" + courseVideo + '\'' +
                    ", courseArticle='" + courseArticle + '\'' +
                    ", courseQA='" + courseQA + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Coures{" +
                "courseName='" + courseName + '\'' +
                ", coursePPT='" + coursePPT + '\'' +
                ", courseVideo='" + courseVideo + '\'' +
                ", courseArticle='" + courseArticle + '\'' +
                ", courseQA='" + courseQA + '\'' +
                '}';
    }
}
