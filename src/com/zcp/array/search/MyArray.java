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
 * @ClassName OArray 面向对象的数组操作
 * @Author ZCP
 * @Date 2019/1/27 0:40
 **/
class MyArray {

    //用于存储数据的数组
    private int[] elements;

    public MyArray() {
        elements = new int[0];
    }

    //获取数组长度的方法
    public int size() {
        return elements.length;
    }

    //往数组的末尾添加一个元素
    public void add(int element) {

        int[] newArr = new int[elements.length + 1];
        //把原数组中的元素复制到新数组中
        for (int i = 0; i < elements.length; i++) {
            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;
        elements = newArr;
    }

    //打印所有元素到控制台
    public void show() {
        for (int i = 0; i < elements.length; i++) {
            System.out.println(elements[i]);
        }
    }

    //删除数组中的元素(删除第几个元素)
    public void delete(int index) {

        //判断下标是否越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        int[] newArr = new int[elements.length - 1];

        //复制原有数据到新数组
        for (int i = 0; i < newArr.length; i++) {
            //如果是想要删除的元素前面的元素，直接赋值
            if (i < index) {
                newArr[i] = elements[i];
            } else {
                //如果是想要删除的元素后面的元素
                newArr[i] = elements[i + 1];
            }
        }
        elements = newArr;
    }

    //获取某个下标的元素
    public int get(int index) {
        //判断下标是否越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        return elements[index];
    }

    //插入一个元素到指定位置(指明插入的位置和插入的元素)
    //1,6
    public void insert(int index, int element) {
        //判断下标是否越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        int[] newArr = new int[elements.length + 1];
        //将原数组中的元素放入到新数组中
        for (int i = 0; i < elements.length; i++) {
            //目标位置之前的元素，直接赋值
            //0,1,2
            //0,1,2,3
            if (i < index) {
                newArr[i] = elements[i];
                //目标位置之后的元素
            } else {
                newArr[i + 1] = elements[i];
            }
        }
        //插入新的元素
        newArr[index] = element;
        //新数组替换旧数组
        elements = newArr;
    }

    //替换指定位置元素
    public void replace(int index, int element) {
        //判断下标是否越界
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }
        elements[index] = element;
    }


    //线性查找
    public int search(int target) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                return i;
            }
        }
        return -1;
    }

    //二分查找
    public int binarySearch(int target) {
        int begin = 0;
        int end = elements.length - 1;
        int mid = (begin + end) >> 1;

        while (true) {
            //什么情况下没有这个元素
            //开始在结束位置之后或重合，没有这个元素
            if (begin >= end) {
                return -1;
            }
            if (target == elements[mid]) {
                return mid;
            } else {

                if (elements[mid] > target) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
                mid = (begin + end) >> 1;
            }
        }
    }
}

