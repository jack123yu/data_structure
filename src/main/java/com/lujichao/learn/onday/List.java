package com.lujichao.learn.onday;

/**
 * 线性表
 * 和存储结构无关
 */
public interface List {
    //返回线性表的大小，即数据元素的个数
    public  int size();
    //返回线性表中序号为i的数据元素
    public Object get(int i);
    //如果线性表为空返回true，否则返回为false
    public boolean isEmpty();
    //判断线性表中是否含数据e
    public boolean contains(Object e);
    //返回元素e在线性表中的序号
    public int indexOf(Object e);
    //将元素e插入到线性表中i的位置
    public void add(int i,Object e);
    //将元素e插入到线性表的末尾
    public void add(Object e);
    //将元素e插入到线性表的obj元素前
    public boolean addBefore(Object obj,Object e);
    //将元素e插入到线性表的obj元素后
    public boolean addAfter(Object obj,Object e);
    //删除线性表序号为i的元素，并返回值
    public Object remove(int i);
    //删除线性表中第一个与e相同的元素
    public boolean remove(Object e);
    //替换线性表中序号为i的数据元素e，返回原数据元素
    public Object replace(Object e);
    //反转列表
    public Object reverse(Object e);

}
