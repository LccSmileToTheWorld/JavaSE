package org.study.entity.test;

/**
 * @ClassName: BankTest
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/29
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        BankRun bankRun = new BankRun();
        Thread thread = new Thread(bankRun);
        Thread thread1 = new Thread(bankRun);
        thread.setName("张三");
        thread1.setName("李四");
        thread.start();
        thread1.start();

        BankThread  bankThread = new BankThread();
        BankThread bankThread1 = new BankThread();
        bankThread.setName("zhangsan");
        bankThread1.setName("lisi");
        bankThread.start();
        bankThread1.start();
    }

}
