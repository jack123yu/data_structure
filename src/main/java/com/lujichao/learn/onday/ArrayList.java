package com.lujichao.learn.onday;

import java.util.Arrays;

/**
 * 顺序表
 *
 * 底层使用数组，长度可以动态变化
 * java.util.Arraylist 长度每次增长50%
 */
public class ArrayList implements List{
    private Object[] elementData;//底层是一个数组，目前长度还没有确定长度
    private int size;//不是数组分类了几个空间，而是元素的个数

    /**
     *
     * @param initialCapacity 数组的初始长度
     */
    ArrayList(int initialCapacity){
        //给数组分配指定数量的空间
        elementData=new Object[initialCapacity];
        //指定顺序表的元素格式，默认为0
        size=0;

    }
    ArrayList(){
        this(4);

    }
    @Override
    public int size() {
        return size;
    }

    @Override
    public Object get(int i) {
        if (i<0||i>=size){
            throw new MyArrayListIndexException("数组索引越界异常:"+i);
        }
        return elementData[i];
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
        if (size==elementData.length){
//            //新创建一个数组，长度是原数组的2倍
//            Object[] newarray=new Object[elementData.length*2];
//            //旧数据的数据拷贝到新数组
//            for (int i = 0; i < size; i++) {
//                newarray[i]=elementData[i];
//            }
//            //将elementData指向新数组
//            elementData=newarray;
            elementData = Arrays.copyOf(elementData, elementData.length * 2);

        }
        for (int j = size; j > i; j--) {
            elementData[j]=elementData[j-1];
        }
        elementData[i] = e;
        size++;


    }

    @Override
    public void add(Object e) {
        //如果长度超出，自动扩容
        if (size==elementData.length){
//            //新创建一个数组，长度是原数组的2倍
//            Object[] newarray=new Object[elementData.length*2];
//            //旧数据的数据拷贝到新数组
//            for (int i = 0; i < size; i++) {
//                newarray[i]=elementData[i];
//            }
//            //将elementData指向新数组
//            elementData=newarray;
            elementData = Arrays.copyOf(elementData, elementData.length * 2);

        }else {
            elementData[size++] = e;
        }
        System.out.println(elementData.length);
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
    public String toString() {
        return Arrays.toString(elementData);
    }
}
