package cn.loong.pattern.creational.simplefactory;

/**
 * @author xiongtaolong
 * @date 2019-04-27 11:37
 */
public class Test {
    public static void main(String[] args) {
        ComputerLanguageFactory computerLanguageFactory = new ComputerLanguageFactory();
        ComputerLanguage computerLanguage = computerLanguageFactory.getComputerLanguage(JavaLanguage.class);
        computerLanguage.getIntroduce();
    }
}
