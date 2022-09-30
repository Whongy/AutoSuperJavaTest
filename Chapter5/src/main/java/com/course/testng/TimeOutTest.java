package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Description:
 * @Author KHAN
 * @Date 2022/9/30$ 15:19$
 */

public class TimeOutTest {
        @Test(timeOut = 3000)
    public void testSuccess() throws InterruptedException {
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void testF() throws InterruptedException {
        Thread.sleep(10000);
    }
}
