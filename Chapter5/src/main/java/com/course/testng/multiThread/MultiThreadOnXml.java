package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Description:
 * @Author KHAN
 * @Date 2022/9/29$ 23:10$
 */

public class MultiThreadOnXml {

    @Test()
    public void test1(){
        //System.out.println(1);
        System.out.printf("Thread ID；%s%n",Thread.currentThread().getId());
    }
    @Test()
    public void test2(){
        //System.out.println(1);
        System.out.printf("Thread ID；%s%n",Thread.currentThread().getId());
    }
    @Test()
    public void test3(){
        //System.out.println(1);
        System.out.printf("Thread ID；%s%n",Thread.currentThread().getId());
    }
}
