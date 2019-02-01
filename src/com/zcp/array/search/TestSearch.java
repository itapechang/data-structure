package com.zcp.array.search;
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
 * @ClassName TestSearch  线性查找，一个一个比
 * @Author ZCP
 * @Date 2019/1/27 13:26
 **/
public class TestSearch {

    public static void main(String[] args){
        //目标数组
        int[] arr={2,3,4,6,8,9,0};
        //目标元素
        int target=8;
        //目标元素所在的下标（找不到返回-1）
        int index=-1;
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                index=i;
                break;
            }
        }
        //打印目标元素的下标
        System.out.println("目标元素下标（index）为："+index);
    }
}
