package cn.loong.pattern.structural.decorator;

/**
 * @author xiongtaolong
 * @date 2019-04-29 21:22
 */
public abstract class HouseStructureDecorator extends HouseStructure{
    HouseStructure houseStructure;

    public HouseStructureDecorator(HouseStructure houseStructure){
        this.houseStructure = houseStructure;
    }

    public String addWood(){
        return houseStructure.addWood();
    }

    public String addCement(){
        return houseStructure.addCement();
    }
}
