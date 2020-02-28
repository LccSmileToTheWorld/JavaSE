package org.study.entity;

/**
 * @ClassName: Father
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/20
 * @Version 1.0
 */
public class Father {

    public void me(){
        we();
    }

    public void we(){
        System.out.println(Thread.currentThread().getName());
        System.out.println("父类");
    }
}
