package cn.loong.principle.dependenceinversion;

/**
 * @author xiongtaolong
 * @date 2019-04-27 11:18
 */
public class Test {
    public static void main(String[] args) {
        JavaBase javaBase = new JavaBase();
        javaBase.setJavaOperation(new JavaOperationSpecific());
        javaBase.operation();
    }
}
