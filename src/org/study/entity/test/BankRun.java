package org.study.entity.test;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: BankRun
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/29
 * @Version 1.0
 */
public class BankRun implements Runnable {

    private int init = 0;
    ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        int i = 0;
        while (i < 3) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            lock.lock();
            init += 1000;
            System.out.println(Thread.currentThread().getName() + "第" + (i + 1) + "次存钱，账号余额为：" + init);
            lock.unlock();
            i++;
        }
    }

    /**
     * @Author: Lcc
     * @Description: 同步方法，因为实现Runnable接口的方式只创建了一次BankRun对象，所以不需要static修饰方法
     * @Date: 2019/12/2
     * @param
     * @Return: void
     */
/*    @Override
    public void run() {
        money();
    }
    public synchronized void money() {
        int i = 0;
        while (i < 3) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            init += 1000;
            System.out.println(Thread.currentThread().getName() + "第" + (i + 1) + "次存钱，账号余额为：" + init);
            i++;
        }
    }*/
    /*
     * @Author: Lcc
     * @Description: 同步代码块
     * @Date: 2019/12/2
     * @param
     * @Return: void
     */
  /* @Override
    public void run() {
        int i = 0;
        while (i < 3) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this){
                init += 1000;
                System.out.println(Thread.currentThread().getName() + "第" + (i + 1) + "次存钱，账号余额为：" + init);
            }
            i++;
        }
    }*/


}
