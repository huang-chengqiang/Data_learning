package com.shujujiegou.www;

import java.util.*;


public class Text {
    public static class LinkList<E>    //单链表泛型类
    {
        LinkNode<E> head;        //存放头结点

        public LinkList()    //构造方法
        {
            head = new LinkNode<E>();    //创建头结点
            head.next = null;        //头结点next成员置为next
        }

        public void CreateListR(E[]a){
            LinkNode<E>s;
            for (E e : a) {
                s = new LinkNode<E>(e);
                s.next = head.next;
                head.next = s;
            }
        }


    }

    static class LinkNode<E>        //单链表结点泛型类
    {
        E data;
        LinkNode<E> next;

        public LinkNode()        //构造方法
        {
            next = null;
        }

        public LinkNode(E d)        //重载构造方法
        {
            data = d;
            next = null;
        }
    }

    public static int Maxcount(LinkList<Integer> L) {
        int cnt = 1;
        Integer maxe;
        LinkNode<Integer> p = L.head.next;
        maxe = p.data;
        while (p.next != null) {
            if (p.next.data > maxe) {
                maxe = p.next.data;
                cnt = 1;
            } else if (maxe.equals(p.next.data))//filp版本的eq，防止空指针崩溃
                cnt++;
            p = p.next;
        }
        return cnt;
    }


    /**public static void main(String[] args) {
        Integer[] data = {1,2,3,3,3,3,3,3};
        LinkList<Integer> temp = new LinkList<Integer>();
        temp.CreateListR(data);
        int count = Maxcount(temp);
        System.out.println(count);
    }*/
    public static void Delmaxnodes(LinkListClass<Integer>L){
        Integer maxe;
        LinkNode<Integer> p=L.head.next,pre;   //p指向首结点
        maxe=p.data;   //maxe置为首结点
        while (p.next!=null){        //查找最大结点值maxe
            if(p.next.data>maxe)
                maxe=p.next.data;
            p=p.next;
        }
        pre=L.head;
        p=pre.next;
        while (p!=null){
            if(p.data==maxe){
                pre.next=p.next;
                p=pre.next;
            }
            else {
                pre=pre.next;
                p=pre.next;
            }
        }

    }
}