package org.study.entity.test;

/**
 * @ClassName: JoinTest
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/21
 * @Version 1.0
 */
public class JoinTest {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new myThread();
        thread.start();
        for (int i = 0; i < 100; i++){
            System.out.println(Thread.currentThread().getName() + ":--------" + i);
            if (i == 50){
                thread.join();
            }
        }

    }

    static class myThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i <100; i++){
                System.out.println(getName()+": " + i);
            }
        }
    }
}
