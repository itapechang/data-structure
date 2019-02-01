package com.zcp.array.search;
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
 * @ClassName TestMyArraySearch
 * @Author ZCP
 * @Date 2019/1/27 13:51
 **/
public class TestMyArraySearch {
    public static void main(String[] args) {
        MyArray ma = new MyArray();
        ma.add(1);
        ma.add(2);
        ma.add(3);
        ma.add(4);
        ma.add(5);
        System.out.println(ma.search(1));
        System.out.println(ma.binarySearch(3));
        System.out.println(ma.binarySearch(6));//查找一个不存在的元素
    }
}
