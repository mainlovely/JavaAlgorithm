package com.seven.javaalgorithm.datastructure.tree;

/**
 * 二叉树(BinaryTree)
 *  1、基于链表的链式存储法 、 基于数组的顺序存储法
 *   链式存储法：
 *        每个节点有三个字段（data、left、right子节点指针）
 *   数组顺序存储法：
 *        父节点i = 1, 左子节点为(2*i)，右子节点为(2*i+1)
 *   如果是完全二叉树，用数组顺序存储法是最节省空间内存，因为链表需要额外保存 左右子节点的指针
 *
 * 2、类型:
 *  a)、满二叉树：叶子节点在最后一层，除了叶子节点，每个节点都有左右两个子节点
 *  b)、完全二叉树:叶子节点在最后两层，最后一层节点都靠左，除了最后一层，其他层的节点个数都达到了最大
 *
 *
 * 3、二叉树的遍历:
 *      a)前序遍历: 先打印节点本身，再打印节点的左子节点，再打印子节点的右节点；
 *          preOrder(r) = print r -> preOrder(r->left) -> preOrder(r->right)
 *      b)中序遍历: 先打印节点的左子节点，再打印节点的本身，最后打印节点的右子节点；
 *          midOrder(r) = midOrder(r->left) -> print r -> midOrder(r->right)
 *      c)后序遍历: 先打印节点的左子节点，再打印节点的右子节点，最后打印本身的节点；
 *          postOrder(r) = postOrder(r->left) -> postOrder(r->right) -> print r
 *
 */
public class BinaryTree {
}
