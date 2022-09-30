package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @Description:
 * @Author KHAN
 * @Date 2022/9/28$ 21:01$
 */

public class GroupsOnMethod {

    @Test(groups = "server")
    public void test1(){
        System.out.println("这是服务端组的测试方法1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是服务端组的测试方法2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("这是客户端组的测试方法2");
    }
    @Test(groups = "client")
    public void test4(){
        System.out.println("这是客户端组的测试方法2");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是服务端组运行之前，运行的方法");
    }
    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是服务端运行之后,运行的方法");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnclient(){
        System.out.println("这是client组运行之前，运行的方法");
    }
    @AfterGroups("client")
    public void afterGroupsOnclient(){
        System.out.println("这是client运行之后,运行的方法");
    }

}
