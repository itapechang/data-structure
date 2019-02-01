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

import java.util.Arrays;

/**
 * @ClassName AddArray数组元素的添加
 * @Author ZCP
 * @Date 2019/1/27 0:22
 **/
public class AddArray {

    public static void main(String[] args){
        int[] arr={7,8,9};
        System.out.println("添加元素前的数组arr:>>>");
        System.out.println(Arrays.toString(arr));
        //添加数值为6的元素
        int dst=6;
        //创建一个新数组
        int[] newArr=new int[arr.length+1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i]=arr[i];
        }
        System.out.println("新数组newArr:>>>");
        System.out.println(Arrays.toString(newArr));

        newArr[arr.length]=dst;
        arr=newArr;
        System.out.println("添加元素后的数组arr:>>>");
        System.out.println(Arrays.toString(arr));
    }

}
