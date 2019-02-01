package com.zcp.tree.arraytree;
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
 * @ClassName ArrayBinaryTree（顺序存储结构，通常是完全二叉树）
 * @Author ZCP
 * @Date 2019/2/1 22:40
 **/
public class ArrayBinaryTree {
    int[] data;

    public ArrayBinaryTree(int[] data){
        this.data=data;
    }


    public void frontShow(){
        frontShow(0);
    }

    //前序遍历(顺序存储结构)
    public void frontShow(int index){
        if(data==null||data.length==0){
            return;
        }

        //先遍历当前节点的内容
        System.out.println(data[index]);
        //2*index+1；处理左子节点
        if(2*index+1<data.length){
            frontShow(2*index+1);
        }

        //2*index+2;处理右子节点（右子树）
        if(2*index+2<data.length){
            frontShow(2*index+2);
        }
    }

}
