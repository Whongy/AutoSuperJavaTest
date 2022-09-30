package com.course.testng;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.testng.annotations.*;

/**
 * @Description:
 * @Author KHAN
 * @Date 2022/9/28$ 11:01$
 */

public class BasicAnnotian2 {

    @Test
    public void test1(){
        System.out.println("123");
    }
    @Test
    public void test2(){
        System.out.println("2222222");
    }
    @BeforeMethod
    public void testBeforM(){
        System.out.println("在123之前");

    }
    @AfterMethod
    public void testAfter(){
        System.out.println("在123之后");
    }
    @BeforeClass
    public void testBeforClass(){
        System.out.println("运行前类执行一次");
    }
    @AfterClass
    public void testAfterClass(){
        System.out.println("运行类后执行一次");
    }
    @AfterSuite
    public void testsuite(){
        System.out.println("suite 阿飞ter");
    }
    @BeforeSuite
    public void testbeforSUITE(){
        System.out.println("SUITE befor");
    }

}
