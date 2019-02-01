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
 * @ClassName DeleteArray 数组元素的删除
 * @Author ZCP
 * @Date 2019/1/27 0:28
 **/
public class DeleteArray {

    public static void main(String[] args) {
        //目标数组
        int[] arr = {7, 6, 5, 8};
        System.out.println("删除之前>>>");
        System.out.println(Arrays.toString(arr));
        //要删除元素的下标
        int index = 1;
        //创建一个新数组，长度为原数组长度减1
        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < newArr.length; i++) {
            //要删除元素之前的元素
            if (i < index) {
                newArr[i] = arr[i];
                //要删除元素之后的元素
            } else {
                newArr[i]=arr[i+1];
            }
        }
        arr=newArr;
        System.out.println("删除之后>>>");
        System.out.println(Arrays.toString(arr));

    }
}
