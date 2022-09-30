package com.course.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/**
 * @Description:
 * @Author KHAN
 * @Date 2022/9/28$ 15:33$
 */

public class SuiteConfig {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("befor suite运行啦");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite 运行啦");
    }
    @BeforeTest
    public void beforetest(){

        System.out.println("beforetest");
    }
    @AfterTest
    public void aftertest(){
        System.out.println("aftertest");
    }

}
