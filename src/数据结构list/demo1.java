package 数据结构list;
//栈和队列
//栈：先进后出
//队列：先进先出

//数组和链表
//数组：查询快，增删慢；
//链表：增删快，查询慢；

//list常用子类：arraylist和linkedlist
//arraylist：底层为数组，查询快，增删慢，更常用
//linkedlist：底层为链表，增删快，查询慢

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

//练习：分别使用两种子类完成遍历
public class demo1 {
    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();

        array.add("hello");
        array.add("world");
        array.add("java");

        //遍历
        for (String s : array){
            System.out.println(s);
        }
        System.out.println("--------------");

        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");
        linkedList.add("java");

        for (String s : linkedList){
            System.out.println(s);
        }
    }
}
