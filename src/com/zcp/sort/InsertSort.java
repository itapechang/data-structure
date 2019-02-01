package com.zcp.sort;
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
 * @ClassName InsertSort  插入排序
 * @Author ZCP
 * @Date 2019/1/30 15:01
 **/
public class InsertSort {

    public static void main(String[] args){

        int[] arr={5,3,2,8,5,9,1,0};
        insertSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertSort(int[] arr){

        //从第二个数字开始遍历
        for (int i = 1; i < arr.length; i++) {
            //当前数字比前一个数字更小
            if(arr[i]<arr[i-1]){
                //把当前变量存起来
                int temp=arr[i];
                //遍历当前数字前面所有的数字
                int j;
                for(j=i-1;j>=0&&temp<arr[j];j--){
                    arr[j+1]=arr[j];
                }
                //把临时变量（外层for循环的当前元素）赋给不满足条件的后一个元素
                arr[j+1]=temp;
            }
        }
    }
}
