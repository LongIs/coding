package cn.loong.principle.dependenceinversion;

/**
 * @author xiongtaolong
 * @date 2019-04-27 11:15
 */
public class JavaBase {

    JavaOperation javaOperation;


    public void setJavaOperation(JavaOperation javaOperation){
        this.javaOperation = javaOperation;
    }

    public void operation(){
        javaOperation.operation();
    }

}
