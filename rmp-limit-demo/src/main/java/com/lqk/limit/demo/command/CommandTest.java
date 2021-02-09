package com.lqk.limit.demo.command;

import org.junit.Test;

/**
 * @author liangqiankun
 * @date 2021/2/8 9:49 下午
 */
public class CommandTest {

    @Test
    public void commandTest() {
        ProcessArray pa = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        pa.process(target, new PrintCommand());
        System.out.println("-----------------");
        pa.process(target, new AddCommand());
    }

    @Test
    public void commandTest1() {
        ProcessArray pa = new ProcessArray();
        int[] target = {3, -4, 6, 4};
        pa.process(target, new Command() {
            @Override
            public void process(int[] target) {
                int sum = 0;
                for (int tmp : target) {
                    sum += tmp;
                }
                System.out.println("数组元素的总和是：" + sum);
            }
        });
    }

    @Test
    public void commandTest2() {
        ProcessArray pa = new ProcessArray();

        int[] array = {3, -4, 6, 4};
        pa.process(array, (int[] target) -> {
            int sum = 0;
            for (int tmp : target) {
                sum += tmp;
            }
            System.out.println("数组元素的总和是：" + sum);
        });
    }

}
