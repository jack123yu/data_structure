package com.lujichao.learn.thirdday;

import java.util.Deque;
import java.util.LinkedList;

public class StackTest {
    public static void main(String[] args) {
        int n=100;
        int t=n;
        Deque stack=new LinkedList();//通过linklist实现栈
        while (t>0){
            int mod=t%2;
            stack.push(mod);
            t=t/2;
        }
        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
