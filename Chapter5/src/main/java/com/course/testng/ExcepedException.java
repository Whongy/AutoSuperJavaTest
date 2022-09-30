package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Description:
 * @Author KHAN
 * @Date 2022/9/29$ 14:21$
 */

public class ExcepedException {
    @Test(expectedExceptions = RuntimeException.class)
    public void RunTimeExceptionFaild(){
        System.out.println("this is failed test exception");
    }


}
