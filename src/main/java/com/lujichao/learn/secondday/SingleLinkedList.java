package com.lujichao.learn.secondday;

import com.lujichao.learn.onday.List;

public class SingleLinkedList implements List {
    private Node head   =new Node();//头节点，不存储数据，为了编程
    private int size;//一共有几个节点
    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        Node p=head;
        for (int j = 0; j <=i ; j++) {
            p=p.next;
        }
        return p.data;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object e) {
        return false;
    }

    @Override
    public int indexOf(Object e) {
        return 0;
    }

    @Override
    public void add(int i, Object e) {
        //找到前一个节点，从head节点开始找
        Node p=head;
        for (int j = 0; j <i ; j++) {
            p=p.next;
        }
        //新创建一个节点
        Node newNode = new Node(e);
        //指明新节点的直接后继节点
        newNode.next=p.next;
        //指明新节点的直接前驱节点
        p.next=newNode;
        size++;

    }

    @Override
    public void add(Object e) {
        this.add(size,e);
    }

    @Override
    public boolean addBefore(Object obj, Object e) {
        return false;
    }

    @Override
    public boolean addAfter(Object obj, Object e) {
        return false;
    }

    @Override
    public Object remove(int i) {
        return null;
    }

    @Override
    public boolean remove(Object e) {
        return false;
    }

    @Override
    public Object replace(Object e) {
        return null;
    }

    @Override
    public Object reverse(Object e) {
        return null;
    }
    public Node reverse(Node node) {
        for (int i = size-1; i >=0 ; i--) {
            System.out.println(node.data);
        }
        return null;
    }

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "head=" + head +
                ", size=" + size +
                '}';
    }
}
