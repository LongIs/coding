package com.loong.pattern.behavioal.strategy.Demo2;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiongtaolong
 * @date 2019-05-07 19:52
 */
public class RequireTypeFactory {

    private static Map<Integer,RequireTypeOperation> factory = new HashMap<>();
    private static RequireTypeFactory requireTypeFactory = new RequireTypeFactory();

    static {
        factory.put(RequireTypeEnum.REQUIRE_TYPE_TEN_10.getCode(),new TenBrand());
        factory.put(RequireTypeEnum.REQUIRE_TYPE_SINGLEBRAND_20.getCode(),new SingleBrand());
        factory.put(RequireTypeEnum.REQUIRE_TYPE_MULTIBRAND_30.getCode(),new MultiBrand());
        factory.put(RequireTypeEnum.REQUIRE_TYPE_DIRECTORDER_40.getCode(),new DirectOrder());
    }

    public RequireTypeOperation getRequireType(int type){
        return factory.get(type);
    }

    public static RequireTypeFactory getFactory(){
        return requireTypeFactory;
    }

}
