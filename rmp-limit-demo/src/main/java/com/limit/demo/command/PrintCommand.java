package com.limit.demo.command;

/**
 * @author liangqiankun
 * @date 2021/2/8 9:51 下午
 */
public class PrintCommand implements Command {
    @Override
    public void process(int[] target) {
        for (int tmp : target) {
            System.out.println("迭代输出目标数组的元素：" + tmp);
        }
    }
}
