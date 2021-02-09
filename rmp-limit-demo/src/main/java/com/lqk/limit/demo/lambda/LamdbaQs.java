package com.lqk.limit.demo.lambda;

/**
 * @author liangqiankun
 * @date 2021/2/8 10:42 下午
 */
public class LamdbaQs {
    public static void main(String[] args) {

        LamdbaQs lq = new LamdbaQs();
        //Lambda 表达式的代码块只有一条语句，可以省略花括号
//        lq.eat(()-> {System.out.println("苹果的味道不错");});
        lq.eat(() -> System.out.println("苹果的味道不错"));
        //Lamdba 表达式的形参列表只有一个形参，可以省略圆括号
//        lq.drive((weather) -> {
//            System.out.println("今天的天气是：" + weather);
//            System.out.println("直升机飞行平稳");
//        });
        lq.drive(weather -> {
            System.out.println("今天的天气是：" + weather);
            System.out.println("直升机飞行平稳");
        });
        //Lambda 表达式的代码块只有一条语句，可以省略花括号
        //代码块只有一条语句，即使该表达式需要返回值，也可以省略 return 关键字
        lq.test((a, b) -> a + b);
//        lq.test((a, b) -> {
//            return a + b;
//        });

        Runnable runnable = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println();
            }
        };


    }

    public void eat(Eatable e) {
        System.out.println(e);
        e.taste();
    }

    public void drive(Flyable f) {
        System.out.println("我正在驾驶：" + f);
        f.fly("晴日：");
    }

    public void test(Addable add) {
        System.out.println("5与3的和为：" + add.add(5, 3));
    }
}
