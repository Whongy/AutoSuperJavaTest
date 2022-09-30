package com.course.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @Description:
 * @Author KHAN
 * @Date 2022/9/29$ 23:03$
 */

public class MultiThreadOnAnootion {


    @Test(invocationCount =  10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread ID；%s%n",Thread.currentThread().getId());
    }
}
