package org.data.lx.erchashu;

/**
 * @ ClassName TestBTree
 * @ Description TODO
 * @ Author faine
 * @ Date 2020/11/3
 */
public class TestBTree {
    public static void main(String[] args) {
        BTreeClass bTree = new BTreeClass();
        bTree.createBTree("(a,(d,f)),(b),(c),(d,q)");
        System.out.println("==========>二叉树高度"+bTree.height());
        System.out.println(bTree.findNode('a').data);
        System.out.println(bTree.toString());
    }
}
