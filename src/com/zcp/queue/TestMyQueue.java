package com.zcp.queue;
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
 * @ClassName TestMyQueue
 * @Author ZCP
 * @Date 2019/1/27 14:34
 **/
public class TestMyQueue {

    public static void main(String[] args){
        MyQueue mq=new MyQueue();
        //入队
        mq.add(2);
        mq.add(8);
        mq.add(4);

        System.out.println("------------出队--------------");
        //出队
        System.out.println(mq.poll());
        System.out.println(mq.poll());
        System.out.println(mq.poll());
    }

}
