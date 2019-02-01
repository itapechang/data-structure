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
 * @ClassName LoopNode 循环链表
 * @Author ZCP
 * @Date 2019/1/27 14:38
 **/
public class LoopNode {

    //节点内容
    int data;

    //下一个节点
    LoopNode next=this;

    public LoopNode(int data) {
        this.data = data;
    }


    //获取下一个节点
    public LoopNode getNext(){
        return this.next;
    }

    //获取节点中的数据
    public int getData(){
        return this.data;
    }



    //删除下一个节点
    public void removeNext(){
        //取出下下一个节点
        LoopNode newNext=next.next;
        //把下下一个节点设置为当前节点的下一个节点
        this.next=newNext;
    }

    //在某一位置插入一个节点
    public void after(LoopNode node){
        //取出当前节点的下一个节点，作为插入节点的下一个节点
        LoopNode nodeNext=next;
        //把新节点作为当前节点的下一个节点
        this.next=node;
        //把下下一个节点设置为新节点的下一个节点
        node.next=nodeNext;
    }

}
