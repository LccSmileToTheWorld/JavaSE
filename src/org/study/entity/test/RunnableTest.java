package org.study.entity.test;

/**
 * .
 *
 * @author lcc
 * @version 1.0
 * @date 2020/2/26     
 */
public class RunnableTest {
    public static void main(String[] args) {
        //3、创建实现类对象
        MyRunnable myRunnable = new MyRunnable();
        //4、将此对象作为参数传递到Thread类的构造器中，创建Thread类对象
        Thread thread = new Thread(myRunnable);
        //5、通过Thread类的对象调用start()
        thread.start();
        System.out.println(Thread.currentThread().getName());
    }
}

//1、创建Runnable接口的实现类
class MyRunnable implements Runnable{

    //2、实现run()，将线程要执行的操作声明在run()中
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
