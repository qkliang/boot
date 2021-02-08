package com.lqk.boot.demo.command;

/**
 * @author liangqiankun
 * @date 2021/2/8 9:46 下午
 */
public class ProcessArray {
    public void process(int[] target, Command cmd) {
        cmd.process(target);
    }
}
