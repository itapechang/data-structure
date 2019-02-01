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
 * @ClassName TestLoopNode
 * @Author ZCP
 * @Date 2019/1/28 18:21
 **/
public class TestLoopNode {

    public static void main(String[] args){

        LoopNode n1=new LoopNode(1);
        LoopNode n2=new LoopNode(2);
        LoopNode n3=new LoopNode(3);
        LoopNode n4=new LoopNode(4);
        //追加节点
        n1.after(n2);
        n2.after(n3);
        n3.after(n4);

        System.out.println(n1.getNext().getData());
        System.out.println(n2.getNext().getData());
        System.out.println(n3.getNext().getData());
        System.out.println(n4.getNext().getData());

    }

}
