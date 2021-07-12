package com.liangqiankun.demo.generics;

public class MyGenerics<T>{
    private T x;
    private T y;

    public T getY() {
        return y;
    }

    public void setY(T y) {
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }
}
