package com.loong.pattern.behavioal.strategy.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-07 19:31
 */
public enum RequireTypeEnum {
    REQUIRE_TYPE_TEN_10(10,"竞价采购"),
    REQUIRE_TYPE_SINGLEBRAND_20(20,"单品牌打包"),
    REQUIRE_TYPE_MULTIBRAND_30(30,"多品牌打包"),
    REQUIRE_TYPE_DIRECTORDER_40(40,"直接订购");

    private int code;
    private String desc;

    public int getCode(){
        return code;
    }

    public String getDesc(){
        return desc;
    }

    RequireTypeEnum(int code , String desc){
        this.code = code;
        this.desc = desc;
    }

}
