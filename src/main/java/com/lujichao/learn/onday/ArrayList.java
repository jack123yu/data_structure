package com.lujichao.learn.onday;

/**
 * 顺序表
 * 底层使用数组，长度可以动态变化
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

    }

    @Override
    public void add(Object e) {
        elementData[size++]=e;
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
}
