package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @Description:
 * @Author KHAN
 * @Date 2022/9/28$ 22:32$
 */
@Test(groups ="stu")
public class GroupsOnClass1 {


    public void stu1(){
        System.out.println("GroupsOnClass1的stu1 运行");
    }
    public void stu2(){
        System.out.println("GroupsOnClass1的stu2 运行");
    }
}
