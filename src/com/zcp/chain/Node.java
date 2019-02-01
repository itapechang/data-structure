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
 * @ClassName Node  一个节点
 * @Author ZCP
 * @Date 2019/1/27 14:38
 **/
public class Node {

    //节点内容
    int data;

    //下一个节点
    Node next;

    public Node(int data) {
        this.data = data;
    }

    //为节点追加节点
//    public void append(Node node){
//        this.next=node;
//    }

    public Node append(Node node){

        Node currentNode=this;    //当前节点

        while (true){
            //查看当前节点是否有下一个节点
            //取出下一个节点
            Node nextNode=currentNode.next;
            //如果下一个节点为null，则是最后一个节点
            if(nextNode==null){
                break;
            }
            //赋给当前节点(currentNode无限往后跳)
            currentNode=nextNode;
        }
        //把需要追加的节点追加为找到的当前节点的下一个
        currentNode.next=node;

        return this;
    }

    //获取下一个节点
    public Node getNext(){
        return this.next;
    }

    //获取节点中的数据
    public int getData(){
        return this.data;
    }

    //当前节点是否是最后一个节点
    public boolean isLast(){
        return next==null?true:false;
    }

    //删除下一个节点
    public void removeNext(){
        //取出下下一个节点
        Node newNext=next.next;
        //把下下一个节点设置为当前节点的下一个节点
        this.next=newNext;
    }

    //在某一位置插入一个节点
    public void after(Node node){
        //取出当前节点的下一个节点，作为插入节点的下一个节点
        Node nodeNext=next;
        //把新节点作为当前节点的下一个节点
        this.next=node;
        //把下下一个节点设置为新节点的下一个节点
        node.next=nodeNext;
    }

    //显示所有节点信息
    public void show(){
        Node currentNode=this;
        while (true){
            System.out.print(currentNode.data+" ");
            //取出下一个节点
            currentNode=currentNode.next;
            //如果是最后一个节点
            if(currentNode==null){
                break;
            }
        }
        System.out.println();
    }
}
