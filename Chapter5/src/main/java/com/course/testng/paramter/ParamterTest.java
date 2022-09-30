package com.course.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @Description:
 * @Author KHAN
 * @Date 2022/9/29$ 21:43$
 */

public class ParamterTest{
    @Test
    @Parameters({"name","age"})
    public void paramTest(String name,int age){
        System.out.println("name=" + name + "age ="+age);
    }
}
