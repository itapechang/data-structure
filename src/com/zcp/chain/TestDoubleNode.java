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
 * @ClassName TestDoubleNode
 * @Author ZCP
 * @Date 2019/1/28 18:39
 **/
public class TestDoubleNode {

    public static void main(String[] args){
        //创建节点
        DoubleNode n1=new DoubleNode(1);
        DoubleNode n2=new DoubleNode(2);
        DoubleNode n3=new DoubleNode(3);
        DoubleNode n4=new DoubleNode(4);

        System.out.println("没有追加节点之前，n1的前一个节点和后一个节点都是本身");
        System.out.println(n1.getNext().getData());
        System.out.println(n1.getPre().getData());

        n1.after(n2);
        n2.after(n3);

        System.out.println("----------n2的前一个节点和下一个节点-------------");
        System.out.println(n2.getPre().getData());
        System.out.println(n2.getNext().getData());

    }
}
