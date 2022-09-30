package com.course.testng;

import org.testng.annotations.Test;

/**
 * @Description:
 * @Author KHAN
 * @Date 2022/9/28$ 20:41$
 */

public class IgnoreTest {
    @Test(enabled = false)
    public void ignore1(){
        System.out.println("ignore1 执行1");
    }
    @Test
    public void ignore2(){
        System.out.println("ignore2 执行1");
    }



}
