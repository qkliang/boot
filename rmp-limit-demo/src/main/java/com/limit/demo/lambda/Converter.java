package com.limit.demo.lambda;

/**
 * @author liangqiankun
 * @date 2021/2/8 11:13 下午
 */
@FunctionalInterface
public interface Converter {
    Integer convert(String from);
}
