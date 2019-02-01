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
 * @ClassName MergeSort 归并排序
 * @Author ZCP
 * @Date 2019/1/31 22:15
 **/
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 2, 4, 6, 8, 10};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int[] arr, int low, int high) {

        //递归结束的条件
        if (low < high) {
            int mid = (low + high) >> 1;
            //处理左边数组
            mergeSort(arr, low, mid);
            //处理右边数组
            mergeSort(arr, mid + 1, high);
            //处理完后归并
            merge(arr, low, mid, high);
        }

    }

    public static void merge(int[] arr, int low, int middle, int high) {

        //用于存储归并后的临时数组
        int[] temp = new int[high - low + 1];
        //用于记录第一个数组中需要遍历的下标
        int i = low;
        //记录第二个数组中需要遍历的下标
        int j = middle + 1;
        //用于记录在临时数组中存放的下标
        int index = 0;
        //循环遍历两个数组，取出小的数字放入临时数组中
        while (i <= middle && j <= high) {
            //第一个数组的数据更小
            if (arr[i] <= arr[j]) {
                //就把小的数据放入临时数组中
                temp[index] = arr[i];
                //让下标向后移
                i++;

            } else {
                temp[index] = arr[j];
                j++;
            }
            index++;
        }
        //处理第二个数组多余的数据
        while (j <= high) {
            temp[index] = arr[j];
            j++;
            index++;
        }

        while (i <= middle) {
            temp[index] = arr[i];
            i++;
            index++;
        }
        //把临时数组中的数据重新存入原数组
        for (int k = 0; k < temp.length; k++) {
            arr[k + low] = temp[k];
        }
    }
}
