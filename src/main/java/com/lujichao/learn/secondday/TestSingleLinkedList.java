package com.lujichao.learn.secondday;

import com.lujichao.learn.onday.ArrayList;
import com.lujichao.learn.onday.List;

public class TestSingleLinkedList {
    public static void main(String[] args) {
        List arrayList = new SingleLinkedList();
        arrayList.add(123);
        arrayList.add(321);
        arrayList.add(898);
        System.out.println(arrayList.size());

    }
}
