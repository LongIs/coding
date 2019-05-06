package org.loong.algorithm.hundredDollarWhiteChicken;

/**
 * @author xiongtaolong
 * @date 2019-04-30 16:55
 * 主要内容是：公鸡5元一只，母鸡3元一只，小鸡1元三只，问100元怎样可以买100鸡？
 */
public class Demo {
    public static void main(String[] args) {
        for (int i = 0; i < 20; i++){
            for (int j = 0; j < 33; j++){
                int x = 100 - (5*i + 3*j);
                int y = x * 3;
                if(i+j+y == 100){
                    System.out.println("i:"+i+",j:"+j+",y:"+y);
                }
            }
        }
    }
}
