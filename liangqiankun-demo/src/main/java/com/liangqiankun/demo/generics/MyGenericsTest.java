package com.liangqiankun.demo.generics;

import org.junit.Test;

public class MyGenericsTest {

    @Test
    public void test1(){
        MyGenerics<String> myGenerics = new MyGenerics<>();
        myGenerics.setX("1");
        myGenerics.setY("2");

        String x = myGenerics.getX();
        String y = myGenerics.getY();

    }

    @Test
    public void test2(){
        for (int i = 1; i < 10 ;i++){
            System.out.println(i);
            if(i % 3 == 0) {
                break;
            }
        }
    }
}
