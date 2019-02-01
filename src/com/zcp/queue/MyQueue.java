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

public class MyQueue {

    int[] elements;

    public MyQueue(){
        elements=new int[0];
    }

    //入队(在数组的末尾加数据)
    public void add(int element){

        int[] newArr=new int[elements.length+1];

        for (int i = 0; i < elements.length; i++) {

            newArr[i]=elements[i];
        }
        newArr[elements.length]=element;

        elements=newArr;
    }

    //出队(从数组的第一个元素取)
    public int poll(){

        if(elements.length==0){
            throw  new  RuntimeException("queue is empty");
        }

        //把数组中第0个元素取出来
        int element=elements[0];

        int[] newArr=new int[elements.length-1];

        //复制原有数组元素到新数组中
        for (int i = 0; i < newArr.length; i++) {
            newArr[i]=elements[i+1];
        }
        elements=newArr;

        return element;
    }

    //判断队列是否为空
    public boolean isEmpty(){
        return elements.length==0?true:false;
    }
}
