package com.zcp.stack;
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
 * @ClassName MyStack
 * @Author ZCP
 * @Date 2019/1/27 14:05
 **/
public class MyStack {

    //栈的底层我们使用数组来存储数据
    int[] elements;

    public MyStack() {
        elements = new int[0];  //初始化
    }

    //压入元素（进栈）,相当于往数组末尾添加数据，每次取从末尾取
    public void push(int element) {

        int[] newArr = new int[elements.length + 1];

        for (int i = 0; i < elements.length; i++) {

            newArr[i] = elements[i];
        }
        newArr[elements.length] = element;

        elements = newArr;
    }

    //取出栈顶元素（取出后栈里面就没有了）
    public int pop() {

        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        //取出数组的最后一个元素(如果长度为0，减去1会报错)
        int element = elements[elements.length - 1];
        //取出后新数组的长度比旧数组长度小1
        int[] newArr = new int[elements.length - 1];
        //原数组中除了最后一个元素，其他元素都放入新数组中
        for (int i = 0; i < elements.length - 1; i++) {
            newArr[i] = elements[i];
        }

        elements = newArr;

        //返回取出的栈顶元素
        return element;
    }

    //查看栈顶元素（查看后栈里面还有）
    public int peek() {
        if (elements.length == 0) {
            throw new RuntimeException("stack is empty");
        }
        return elements[elements.length - 1];
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return elements.length==0?true:false;
    }

}

