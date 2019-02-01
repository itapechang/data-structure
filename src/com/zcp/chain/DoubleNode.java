package com.zcp.chain;
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
 * @ClassName DoubleNode  循环双向链表
 * @Author ZCP
 * @Date 2019/1/28 18:29
 **/
public class DoubleNode {

    //上一个节点
    DoubleNode pre=this;

    //下一个节点
    DoubleNode next=this;   //如果只有一个节点，那么它的上一个节点和下一个节点都是它自己

    //节点数据
    int data;

    public DoubleNode(int data){
        this.data=data;
    }

    //增加节点
    public void after(DoubleNode node){
        //原来的下一个节点
        DoubleNode nextNext=next;
        //把新节点作为当前节点的下一个节点
        this.next=node;
        //把当前节点做新节点的前一个节点
        node.pre=this;
        //让原来的下一个节点作新节点的下一个节点
        node.next=nextNext;
        //让原来的下一个节点的上一个节点为新节点
        nextNext.pre=node;
    }

    //获取下一个节点
    public DoubleNode getNext(){
        return this.next;
    }

    //获取上一个节点
    public DoubleNode getPre(){
        return this.pre;
    }

    //获取数据
    public int getData(){
        return this.data;
    }
}
