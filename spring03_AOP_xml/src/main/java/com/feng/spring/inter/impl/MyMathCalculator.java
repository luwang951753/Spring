package com.feng.spring.inter.impl;

import org.springframework.stereotype.Service;


public class MyMathCalculator{
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("方法内部执行");
        return result;
    }

    public int sub(int i, int j) {
        int result = i - j;
        return result;
    }

    public int mul(int i, int j) {
        int result = i * j;
        return result;
    }

    public int div(int i, int j) {
        int result = i / j;
        return result;
    }
}
