package com.zcp.tree;
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
 * @ClassName TestBinaryTree  创建一颗二叉树的方式
 * @Author ZCP
 * @Date 2019/2/1 21:26
 **/
public class TestBinaryTree {

    public static void main(String[] args){
        //创建一颗树
        BinaryTree binTree=new BinaryTree();

        //创建一个根节点
        TreeNode root=new TreeNode(1);

        //把根节点赋给树
        binTree.setRoot(root);

        //创建一个左节点
        TreeNode rootL=new TreeNode(2);
        //把新创建的节点设置为根节点的子节点
        root.setLeftNode(rootL);
        //创建一个右节点
        TreeNode rootR=new TreeNode(3);
        //把新创建的节点设置为根节点的子节点
        root.setRightNode(rootR);

        //为第二层的左节点（权为2）创建左节点
        rootL.setLeftNode(new TreeNode(4));
        rootL.setRightNode(new TreeNode(5));

        //为第二层的左节点（权为3）创建左节点
        rootR.setLeftNode(new TreeNode(6));
        rootR.setRightNode(new TreeNode(7));

        System.out.println("--------------前序遍历---------------");
        //遍历树(前序遍历)
        binTree.frontShow();
        System.out.println();
        System.out.println("--------------中序遍历---------------");
        //中序遍历
        binTree.midShow();
        System.out.println();
        System.out.println("--------------后序遍历---------------");
        //后序遍历
        binTree.afterShow();
        System.out.println();

        System.out.println("====================================");

        System.out.println("--------------前序查找---------------");
        //前序查找
        TreeNode result=binTree.frontSearch(5);
        System.out.println(result);

        System.out.println("====================================");

        System.out.println("--------------删除一个节点（子树）---------------");
        //删除一个子树
        binTree.delete(5);
        binTree.frontShow();
    }
}
