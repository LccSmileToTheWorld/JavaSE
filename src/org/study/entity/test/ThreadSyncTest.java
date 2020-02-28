package org.study.entity.test;

/**
 * 线程同步测试.
 *
 * @author lcc
 * @version 1.0
 * @date 2020/2/27     
 */
public class ThreadSyncTest {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread thread = new Thread(ticket);
        Thread thread1 = new Thread(ticket);
        Thread thread2 = new Thread(ticket);
        thread.setName("一号窗口");
        thread1.setName("二号窗口");
        thread2.setName("三号窗口");
        thread.start();
        thread1.start();
        thread2.start();
    }

}

class Ticket implements Runnable {

    private int count = 100;

    @Override
    public void run() {
        Object obj = new Object();
        while (true) {
            Object obj2 = new Object();
            /**
             * this--类的对象，实现Runnable接口方式，只需要创建一次对象，所以三个线程的锁是同一个
             * 同步监视器(锁)可以是任一类的对象，但多个线程的锁要保持一致，这里可以使用obj，但不能使用obj2
             */
            synchronized (this) {
                if (count > 0) {
                    System.out.println(Thread.currentThread().getName() + "卖第" + count + "张票");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    count--;
                } else {
                    break;
                }
            }
        }
    }
}
