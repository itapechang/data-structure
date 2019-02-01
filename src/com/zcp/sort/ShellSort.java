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

/**,5,
 * @ClassName ShellSort  希尔排序
 * @Author ZCP
 * @Date 2019/1/31 17:26
 **/
public class ShellSort {


    public static void main(String[] args){

        int[] arr={3,5,2,7,8,1,2,0,4,7,4,3,8};
        System.out.println("---------------排序之前---------------");
        System.out.println(Arrays.toString(arr));
        System.out.println("-------------------------------------");
        shellSort(arr);
        System.out.println("---------------排序之后---------------");
        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        int k=1;
        //遍历所有的步长（增量）
        for(int d=arr.length/2;d>0;d/=2){
            //遍历所有的元素
            for(int i=d;i<arr.length;i++){
                //遍历本组中所有的元素
                for (int j=i-d;j>=0;j-=d){
                    //如果当前元素大于加上步长后的那个元素
                    if(arr[j]>arr[j+d]){
                        int temp=arr[j];
                        arr[j]=arr[j+d];
                        arr[j+d]=temp;
                    }
                }
            }

            System.out.println("第"+(k++)+"次排序结果："+Arrays.toString(arr));
        }
    }
}
