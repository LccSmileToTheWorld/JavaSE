package org.study.entity;

/**
 * @ClassName: Person
 * @Description:
 * @Author: Lcc
 * @Date: 2019/11/19
 * @Version 1.0
 */
public class Person {

    private String name;

    public Person(){
        System.out.println("构造器");
    }

    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("代码块");
    }

    public static void say(){
        System.out.println("静态方法");
    }
}
