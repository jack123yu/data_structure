package com.lujichao.learn.secondday;

/**
 * 单链表的节点
 */

public class Node {
    Object data;//要存储的数据
    Node next;
    public Node(Object data) {
        this.data = data;
    }
    public Node() {

    }

    public Node(Object data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
