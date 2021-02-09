package com.lqk.limit.demo.command;

/**
 * @author liangqiankun
 * @date 2021/2/8 9:53 下午
 */
public class AddCommand implements Command {

    @Override
    public void process(int[] target) {
        int sum = 0;
        for (int tmp : target) {
            sum += tmp;
        }
        System.out.println("数组元素的总和是：" + sum);
    }
}
