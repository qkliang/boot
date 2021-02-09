package com.lqk.limit.demo.lambda;

import org.junit.Test;

/**
 * @author liangqiankun
 * @date 2021/2/8 11:31 下午
 */

public class converterTest {

    @Test
    public void test2(){
        Converter converter = from -> "fkit.org".indexOf(from);
        Integer val = converter.convert("it");
        System.out.println(val);

        int val1 = "fkit.org".indexOf("t");
        System.out.println(val1);

        Converter converter1 = "fkit.org"::indexOf;
        Integer val2 = converter1.convert("it");
        System.out.println(val2);
    }
    @Test
    public void test1(){
        Converter converter = (f) -> Integer.valueOf(f);
//                from -> Integer.valueOf(from);
        Integer val = converter.convert("99");
        System.out.println(val);

        Converter converter1 = Integer::valueOf;
        Integer val1 = converter1.convert("88");
        System.out.println(val1);

        Converter converter2 = new MyConverter();
        Integer val2 = converter2.convert("77");
        System.out.println(val2);
    }
}
