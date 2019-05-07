package com.loong.pattern.behavioal.strategy.Demo2;

/**
 * @author xiongtaolong
 * @date 2019-05-07 20:35
 */
public class Test {
    public static void main(String[] args) {
        Context context = new Context();
        context.croRequireType(RequireTypeEnum.REQUIRE_TYPE_TEN_10.getCode());
        context.croRequireType(RequireTypeEnum.REQUIRE_TYPE_SINGLEBRAND_20.getCode());
        context.croRequireType(RequireTypeEnum.REQUIRE_TYPE_MULTIBRAND_30.getCode());
        context.croRequireType(RequireTypeEnum.REQUIRE_TYPE_DIRECTORDER_40.getCode());
    }
}
