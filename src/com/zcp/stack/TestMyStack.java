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
 * @ClassName TestMyStack
 * @Author ZCP
 * @Date 2019/1/27 14:14
 **/
public class TestMyStack {

    public static void main(String[] args){
        MyStack ms =new MyStack();
        //压入数据
        ms.push(21);
        ms.push(22);
        ms.push(11);

        System.out.println("----------取出栈顶元素----------");
        //取出栈顶元素
        int pop = ms.pop();
        System.out.println(pop);

        System.out.println("----------查看栈顶元素----------");
        //查看栈顶元素
        System.out.println(ms.peek());
        System.out.println("----------判断栈是否为空----------");
        //看栈是否为空
        System.out.println(ms.isEmpty());
    }

}
