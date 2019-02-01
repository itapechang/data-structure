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
 * @ClassName TestBinarySearch  二分查找
 * @Author ZCP
 * @Date 2019/1/27 13:30
 **/
public class TestBinarySearch {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int target = 2;
        //记录开始位置
        int begin = 0;
        //记录结束位置
        int end = arr.length - 1;
        //记录中间位置
        int mid = (begin + end) >> 1;
        System.out.println(mid);
        int index = -1;
        //循环查找
        while (true) {
            //判断中间这个元素是不是要查找的元素
            if (arr[mid] == target) {
                index = mid;
                break;
                //中间这个元素不是要查找的元素
            } else {
                //判断中间这个元素是不是比目标元素大
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
                //取出新的中间位置
                mid=(begin+end)>>1;
            }
        }
        System.out.println("index:>>>" + index);
    }
}
