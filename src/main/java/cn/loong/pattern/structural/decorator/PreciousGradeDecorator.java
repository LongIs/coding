package cn.loong.pattern.structural.decorator;

/**
 * @author xiongtaolong
 * @date 2019-04-29 21:31
 */
public class PreciousGradeDecorator extends HouseStructureDecorator {
    public PreciousGradeDecorator(HouseStructure houseStructure) {
        super(houseStructure);
    }

    public String addWood(){
        return super.addWood()+" 珍稀";
    }

    public String addCement(){
        return super.addCement()+" 普通";
    }
}
