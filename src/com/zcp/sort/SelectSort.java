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
 * @ClassName SelectSort
 * @Author ZCP
 * @Date 2019/1/31 18:11
 **/
public class SelectSort {

    public static void main(String[] args){
        int[] arr={3,4,5,7,1,2,0,3,6,8};

//        selectSort(arr);
        selectSort1(arr);
        System.out.println(Arrays.toString(arr));
    }

    //选择排序
    private static void selectSort(int[] arr) {

        //遍历所有的数
        for(int i=0;i<arr.length;i++){
            int minIndex=i;

            //把当前遍历的数和后面所有的数依次进行比较，并记录下最小的数的下标
            for(int j=i+1;j<arr.length;j++){
                //如果后面比较的数比记录的最小的数小
                if(arr[minIndex]>arr[j]){
                    //就记录最小数的下标
                    minIndex=j;
                }
            }
            //如果最小的数和当前遍历数的下标不一致,说明下标为minIndex的数比当前遍历的数更小
            if(i!=minIndex){
                int temp=arr[i];
                arr[i]=arr[minIndex];
                arr[minIndex]=temp;
            }
        }
    }


    //选择排序
    public static void selectSort1(int[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
