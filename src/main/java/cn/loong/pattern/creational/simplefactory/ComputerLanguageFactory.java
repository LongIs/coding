package cn.loong.pattern.creational.simplefactory;

/**
 * @author xiongtaolong
 * @date 2019-04-27 11:36
 */
public class ComputerLanguageFactory {
    public ComputerLanguage getComputerLanguage(Class clazz){
        try {
            return (ComputerLanguage) clazz.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }
}
