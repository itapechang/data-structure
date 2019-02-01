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
 * @ClassName TreeNode
 * @Author ZCP
 * @Date 2019/2/1 21:32
 **/
public class TreeNode {

    //节点的权（也就是圈里面的数字）
    int value;

    //左儿子
    TreeNode leftNode;
    //右儿子
    TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    //前序遍历(递归)
    public void frontShow() {

        //先遍历当前节点的内容
        System.out.print(value + " ");

        //左节点
        if (leftNode != null) {
            leftNode.frontShow();
        }

        //右节点
        if (rightNode != null) {
            rightNode.frontShow();
        }
    }


    //中序遍历(递归)
    public void midShow() {

        if (leftNode != null) {

            leftNode.midShow();

        }
        System.out.print(value + " ");

        if (rightNode != null) {
            rightNode.midShow();
        }
    }

    public void afterShow() {

        if (leftNode != null) {
            leftNode.afterShow();
        }
        if (rightNode != null) {
            rightNode.afterShow();
        }

        System.out.print(value + " ");
    }

    //前序查找
    public TreeNode frontSearch(int i) {
        TreeNode target = null;

        //对比当前节点的值，如果是就直接return
        if (this.value == i) {
            return this;

            //当前节点的值不是要查找的节点
        } else {

            //查找左儿子
            if (leftNode != null) {
                //有可能可以查到，也可能查不到，查不到的话，target=null;
                target = leftNode.frontSearch(i);
            }
            //如果不为空，说明在左儿子中已经找到，就return
            if (target != null) {
                return target;
            }
            //左边没有的话，再来查找右儿子节点
            if (rightNode != null) {
                target = rightNode.frontSearch(i);
            }
        }
        return target;
    }

    //删除子树
    public void delete(int i) {

        TreeNode parent = this;
        //判断左儿子
        if (parent.leftNode!=null&&parent.leftNode.value == i) {
            parent.leftNode = null;
            return;
        }
        //判断右儿子
        if (parent.rightNode!=null&&parent.rightNode.value == i) {
            parent.rightNode = null;
            return;
        }
        //如果都不是
        //递归检查并删除左儿子
        parent = leftNode;
        if (parent != null) {
            parent.delete(i);
        }

        //递归检查并删除右儿子
        parent = rightNode;
        if (parent != null) {
            parent.delete(i);
        }
    }
}
