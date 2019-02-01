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

import com.zcp.queue.MyQueue;

import java.util.Arrays;

/**
 * @ClassName RadixSort 基数排序
 * @Author ZCP
 * @Date 2019/1/31 22:46
 **/
public class RadixSort {
    public static void main(String[] args) {
        int[] arr = {23, 6, 189, 45, 9, 278, 56, 1, 798, 34, 65, 652, 5};
        radixSort(arr);
        System.out.println(Arrays.toString(arr));

        System.out.println("----------------------队列实现-----------------------");
        radixSortQue(arr);
        System.out.println(Arrays.toString(arr));
    }

    //基数排序的第一种算法
    public static void radixSort(int[] arr) {
        //存数组中最大的数字,主要是为了看是几位数
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //求最大数字的位数
        int maxLength = (max + "").length();

        //用于临时存储数据的数组（二维数值10*?）
        //余数最大为9，也就是10个桶，每个桶放几个数不确定，其实最大是这个数组的长度，通常情况下是不可能的
        int[][] temp = new int[10][arr.length];
        //用于记录在相应的数组temp（桶）中存放的数字的数量
        int[] counts = new int[10];
        //根据最大长度的数字来决定比较的次数
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            //把每一个数字分别计算余数
            //0次，取个位
            //1次，取十位
            //2次，取百位
            for (int j = 0; j < arr.length; j++) {
                int ys = arr[j] / n % 10;  //取到余数
                temp[ys][counts[ys]] = arr[j];
                //记录数量
                counts[ys]++;
            }
//            if(i==0){
//                for (int[] nums : temp) {
//                    System.out.println(Arrays.toString(nums));
//                }
//                System.out.println(Arrays.toString(counts));
//            }

            //记录取的元素需要放的位置
            int index = 0;
            //把数字取出来
            for (int k = 0; k < counts.length; k++) {
                //记录数量的数组中，当前余数记录的数量不为0
                if (counts[k] != 0) {
                    //循环取出元素
                    for (int l = 0; l < counts[k]; l++) {
                        //取出元素
                        arr[index] = temp[k][l];
                        index++;
                    }

                    //把数量变为0，因为进行十位比较的时候还有一轮
                    counts[k] = 0;
                }
            }
        }
    }

    //基数排序的队列优化算法
    //放到每个桶里，先放进去要先取出来
    public static void radixSortQue(int[] arr) {
        //存数组中最大的数字,主要是为了看是几位数
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        //求最大数字的位数
        int maxLength = (max + "").length();

        //用于临时存储数据的队列的数组
        //余数最大为9，也就是10个桶，每个桶放几个数不确定，其实最大是这个数组的长度，通常情况下是不可能的
        MyQueue[] temp = new MyQueue[10];
        //为队列数组赋值
        for(int i=0;i<temp.length;i++){
            temp[i]=new MyQueue();
        }

        //根据最大长度的数字来决定比较的次数
        for (int i = 0, n = 1; i < maxLength; i++, n *= 10) {
            //把每一个数字分别计算余数
            //0次，取个位
            //1次，取十位
            //2次，取百位
            for (int j = 0; j < arr.length; j++) {
                int ys = arr[j] / n % 10;  //取到余数
                //把当前遍历的数据放入指定的队列中
                temp[ys].add(arr[j]);

            }
            //记录取的元素需要放的位置
            int index = 0;
            //把所有队列中的数字取出来
            for (int k = 0; k < temp.length; k++) {
                //当前遍历的队列不为空
                //循环取出元素
                while (!temp[k].isEmpty()) {
                    //取出元素
                    arr[index]=temp[k].poll();
                    //记录下一个元素
                    index++;
                }
            }
        }
    }
}