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

/**
 * @ClassName BubbleSort   冒泡
 * @Author ZCP
 * @Date 2019/1/29 22:41
 **/
public class BubbleSort {


    public static void main(String[] args){

        int[] arr=new int[]{5,1,8,7,4,6};

        bubbleSort(arr);
    }

    /**
     * 5,1,8,7,4,6   第一轮：比较length-1次， 5
     *               第二轮：比较length-1-1次 4
     *               3                       3
     *               4                       2
     *               5                       1
     *                  ....
     *
     **/

    public static void bubbleSort(int[] arr){
        //控制比较多少轮
        for(int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}

