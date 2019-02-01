package com.zcp.recursion;
//
// 
//                          ,.
//                         (_|,.
//                        ,' /, )_______   _
//                     __j o``-'        `.'-)'
//                    (")                 \'
//                     `-j                |
//                       `-._(           /
//                   zcp    |_\  |--^.  /
//                         /_]'|_| /_)_/
//                            /_]'  /_]'
//
//

/**
 * @ClassName TestHanoi  递归解决汉诺塔问题
 * @Author ZCP
 * @Date 2019/1/29 22:07
 **/
public class TestHanoi {

    public static void main(String[] args) {
        hanoi(2, 'A', 'B', 'C');
    }

    /**
     * @param n    共有N个盘子
     * @param from 开始的柱子
     * @param in   中间柱子
     * @param to   目标柱子
     * @return void
     * @Description //T
     **/
    public static void hanoi(int n, char from, char in, char to) {
        if (n == 1) {
            System.out.println("第1个盘子从" + from + "移动到" + to);
            //无论有多少个盘子都认为只有两个盘子，分成上面的所有盘子和最下面的一个盘子
        } else {
            //移动上面所有的盘子到中间位置
            hanoi(n-1, from, to, in);
            //移动下面的盘子
            System.out.println("第"+n+"个盘子从" + from + "移动到" + to);
            //把上面的所有盘子从中间位置移到目标位置
            hanoi(n-1,in,from,to);
        }
    }
}
