package com.lujichao.learn.onday;

/**
 * 自定义异常，只需要继承RuntimeException类并实现父类中的构造方法即可
 */
public class MyArrayListIndexException extends RuntimeException {
    public MyArrayListIndexException() {
        super();
    }

    public MyArrayListIndexException(String message) {
        super(message);
    }
}
