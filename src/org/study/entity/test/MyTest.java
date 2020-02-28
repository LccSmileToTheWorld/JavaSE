package org.study.entity.test;


import org.study.entity.Person;
import org.study.entity.Son;

/**
 * @ClassName: MyTest
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/19
 * @Version 1.0
 */
public class MyTest {

    public static void main(String[] args) {

        new Thread(){
            @Override
            public void run() {
                System.out.println("新进程：" + getName());
            }
        }.start();

        System.out.println("主进程：" + Thread.currentThread().getName());

        Window window = new Window();
        Window window2 = new Window();
        Window window3 = new Window();

        window.setName("窗口1");
        window2.setName("窗口2");
        window3.setName("窗口3");

        window.start();
        window3.start();
        window2.start();

        Runnable window4 = new Window();
        System.out.println(window4.getClass());

        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println("匿名内部类");
            }
        }).start();
    }

}

class Window extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while (ticket > 0){
            System.out.println(getName() + " 售票：" + ticket);
            ticket--;
        }
    }
}