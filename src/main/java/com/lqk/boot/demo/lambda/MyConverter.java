package com.lqk.boot.demo.lambda;

/**
 * @author liangqiankun
 * @date 2021/2/8 11:28 下午
 */
public class MyConverter implements Converter{
    @Override
    public Integer convert(String from) {
        return Integer.valueOf(from);
    }
}
