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
 * @ClassName TestNode  单链表
 * @Author ZCP
 * @Date 2019/1/27 14:40
 **/
public class TestNode {

    public static void main(String[] args) {
        //创建节点
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        //追加节点
//        n1.append(n2);
//        n2.append(n3);
//        n1.append(n2);
//        n1.append(n3);
        n1.append(n2).append(n3).append(new Node(4));
        //获取下一个节点的数据
        System.out.println(n1.getNext().getData());
        System.out.println("------------判断是否是最后一个节点------------");
        System.out.println(n1.isLast());
        System.out.println(n3.isLast());
        System.out.println("--------------显示所有节点---------------");
        n1.show();
        System.out.println("------------删除一个节点---------------");
        //删除节点3
        n1.getNext().removeNext();
        n1.show();
        //插入一个节点
        System.out.println("-------------插入一个节点----------------");
        Node n5=new Node(5);
        n1.getNext().after(n5);
        n1.show();

    }
}
