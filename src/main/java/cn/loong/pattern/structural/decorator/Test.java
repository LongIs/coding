package cn.loong.pattern.structural.decorator;

/**
 * @author xiongtaolong
 * @date 2019-04-29 21:20
 */
public class Test {
    public static void main(String[] args) {
        HouseStructure houseStructure = new EmperorHouseStructure();
        houseStructure = new ParticularYearDecorator(houseStructure);
        houseStructure = new PreciousGradeDecorator(houseStructure);
        System.out.println(houseStructure.addWood());
        System.out.println(houseStructure.addCement());
    }
}
