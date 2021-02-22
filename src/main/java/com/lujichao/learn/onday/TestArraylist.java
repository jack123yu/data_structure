package com.lujichao.learn.onday;

public class TestArraylist {
    public static void main(String[] args) {
        ArrayList<Number> arrayList = new ArrayList<Number>();
        arrayList.add(123);
        arrayList.add(321);
        arrayList.add(898);
        arrayList.add(898);
        arrayList.add(898);
        arrayList.add(898);
        arrayList.add(5,333898);
        System.out.println(arrayList.get(5));
        System.out.println(arrayList);

    }
}
