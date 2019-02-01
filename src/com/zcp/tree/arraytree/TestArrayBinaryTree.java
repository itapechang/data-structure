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
 * @ClassName TestArrayBinaryTree
 * @Author ZCP
 * @Date 2019/2/1 22:46
 **/
public class TestArrayBinaryTree {

    public static void main(String[] args){
        int[] data={1,2,3,4,5,6,7};

        ArrayBinaryTree tree=new ArrayBinaryTree(data);
        //前序遍历
        tree.frontShow();
    }
}
