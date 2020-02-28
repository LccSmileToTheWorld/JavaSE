package org.study.entity.test;

/**
 * .
 *
 * @author lcc
 * @version 1.0
 * @date 2020/2/26     
 */
public class ThreadTest {
    public static void main(String[] args) {
        //3、创建Thread类子类对象
        MyThread myThread = new MyThread();
        MyThread myThread2 = new MyThread();
        //4、通过此对象调用start()
        myThread.start();
        myThread2.start();
        System.out.println(Thread.currentThread().getName());
    }
}

//1、创建Thread类的子类
class MyThread extends Thread{

    //2、重写run()，将此线程执行的操作声明在run()中
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
