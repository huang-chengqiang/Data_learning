package org.data.lx.zhan;

import jdk.nashorn.internal.ir.IfNode;

/**
 * @ClassName SqStackClass
 * @Description 栈的基本运算
 * @Author faine
 * @Date 2020/10/20
 */
public class SqStackClass<E> {
    final int initcapacity = 10 ;
    private int capacity;
    private E[] data;
    private int top;

    public SqStackClass(){
        data = (E[])new Object[initcapacity];
        capacity = initcapacity;
        top = -1;
    }
    private  void updatecapacity(int newcapacity){
        E[] newdata = (E[])new Object[newcapacity];
        for (int i = 0; i < top; i++)
            newdata[i] = data[i];
        capacity = newcapacity;
        data = newdata;
    }
    //栈的基本运算算法

    /**
     *
     * 判断栈是否为空 empty()
     */
        public boolean empty () {
        return top == -1;
    }

    /**
     * 进栈push（e）
     * */
    public void push(E e){
        if(top==capacity - 1)
            updatecapacity(2*(top + 1));
        top++;
        data[top]=e;
    }
    /**
     * 出栈pop()
     */
    public E pop(){
        if (empty())
            throw new IllegalArgumentException("栈空");
            E e = (E) data[top];
            top--;
        if(top + 1 > initcapacity && top + 1 == capacity / 4)
            updatecapacity(capacity / 2);
        return e;
    }
    /**
     * 取栈顶元素peek()
     */
    public E peek(){     //取栈顶元素操作
        if(empty())
            throw new IllegalArgumentException("栈空");
            return (E) data[top];
    }
}
