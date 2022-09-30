package com.course.testng.groups;

import org.testng.annotations.Test;

/**
 * @Description:
 * @Author KHAN
 * @Date 2022/9/28$ 22:33$
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3 teacher1运行");
    }
    public void teacher2(){
        System.out.println("GroupsOnClass3 teacher2运行");
    }

}
