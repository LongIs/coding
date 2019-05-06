package org.loong.algorithm.hanSoldiers;

/**
 * @author xiongtaolong
 * @date 2019-05-06 18:59
 * 韩信带兵不足百人，3人一行排列多一人，7人一行排列少两人，5人一行正好，本例是计算韩信究竟点了多少兵？
 */
public class Demo {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++){
            if(i % 3 == 1 && i % 7 == 5 && i % 5 == 0){
                System.out.println(i);
            }
        }
    }
}
