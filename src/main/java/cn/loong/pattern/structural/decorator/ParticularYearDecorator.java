package cn.loong.pattern.structural.decorator;

/**
 * @author xiongtaolong
 * @date 2019-04-29 21:27
 */
public class ParticularYearDecorator extends HouseStructureDecorator{
    public ParticularYearDecorator(HouseStructure houseStructure) {
        super(houseStructure);
    }

    public String addWood(){
        return super.addWood()+" 100年份";
    }

    public String addCement(){
        return super.addCement()+" 200年份";
    }
}
