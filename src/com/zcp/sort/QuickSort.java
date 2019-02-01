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
 * @ClassName QuickSort  快速排序
 * @Author ZCP
 * @Date 2019/1/30 14:35
 **/
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {3, 4, 6, 7, 2, 7, 1, 8, 0};
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }



    public static void quickSort(int[] arr, int start, int end) {

        //递归结束条件
        if (start < end) {
            //把数组中的第0个数字作为标准数
            int stand = arr[start];
            //记录需要排序的下标
            int low = start;
            int high = end;
            //需要循环的去找数字，然后替换，低的往高的走，高的往低的走，如果low==high重合就不用再找
            //循环找比标准数大的数和比标准数小的数
            while (low < high) {
                while (low < high && stand <= arr[high]) {
                    high--;   //右边的数字比标准数更大的，则下标向前移
                }
                //证明右边的数字比标准数小
                //使用右边的数字替换左边的数字
                arr[low] = arr[high];
                //如果左边的数字比标准数小，下标往前走
                while (low < high && arr[low] <= stand) {
                    low++;
                }
                //
                arr[high] = arr[low];
            }
            //把标准数赋给low或high的数组元素，因为此时low=high了，重合
            arr[low] = stand;
            //处理所有比标准数小的数字
            quickSort(arr, start, low);
            //处理所有比标准数大的数字
            quickSort(arr, low + 1, end);
        }
    }

}
