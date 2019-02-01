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
 * @ClassName TestFebonacci   递归解决斐波那契数列
 * @Author ZCP
 * @Date 2019/1/29 21:55
 **/
public class TestFebonacci {

    public static void main(String[] args) {
        //斐波那契数列
        //1 1 2 3 5 8 13 21....
        //打印第n项斐波那契数列
        int febonacci = febonacci(8);
        System.out.println(febonacci);

    }

    public static int febonacci(int n) {
        //前两项
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return febonacci(n - 1) + febonacci(n - 2);
        }
    }
}
