package com.zcp.array;
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
 * @ClassName TestArray
 * @Author ZCP
 * @Date 2019/1/27 0:06
 **/
public class TestArray {


    public static void main(String[] args){
        //创建一个数组
        int[] arr1=new int[3];
        //获取数组的长度
        int length1=arr1.length;
        System.out.println("arr1的length: >> "+length1);
        //访问数组中的元素，下标最大可以取到length-1
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        int maxIndex=length1-1;
        System.out.println(maxIndex);
        System.out.println(arr1[maxIndex]);
        arr1[maxIndex]=99; //给数组中的元素赋值
        arr1[1]=98;
        arr1[0]=97;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("下标为 ： >>>"+i+"的元素值为：>>"+arr1[i]);
        }

    }
}
