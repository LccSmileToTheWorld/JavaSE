package org.study.entity.test;

/**
 * @ClassName: BankThread
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/29
 * @Version 1.0
 */
public class BankThread extends Thread {

    public static int money = 0;

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            synchronized (BankThread.class){
                money += 1000;
                System.out.println(getName() + "第" + (i + 1) + "次存钱，账号余额为：" + money);
            }
        }
    }
}
