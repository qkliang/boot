package com.lqk.boot.demo;

import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;

/**
 * @author liangqiankun
 * @date 2021/2/8 9:13 下午
 */
public class Lambda {

    @Test
    public void CommandTest(){

    }
    @Test
    public void testCollectionEach(){
        Collection books = new HashSet();
        books.add("轻量级Java EE企业应用实践");
        books.add("疯狂Java讲义");
        books.add("疯狂Android讲义");
        books.forEach(obj -> System.out.println("迭代集合元素：" + obj));

    }
}
