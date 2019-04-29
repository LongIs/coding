package cn.loong.pattern.structural.decorator;

/**
 * @author xiongtaolong
 * @date 2019-04-29 21:18
 */
public class EmperorHouseStructure extends HouseStructure {
    public String addWood() {
        return "顿木";
    }

    public String addCement() {
        return "水泥";
    }
}
