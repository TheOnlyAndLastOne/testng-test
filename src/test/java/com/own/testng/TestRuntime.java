package com.own.testng;

import com.own.testng.pojo.MyAssert;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * @author zhi.zhao
 * @date 5/18/2019 2:11 PM
 * 异常处理
 */
public class TestRuntime {

    //@Test(expectedExceptions = ArithmeticException.class)
    @Test(description = "测试异常情况")
    public void divisionWithException() {
//        int i = 1 / 0;
//        System.out.println("After division the value of i is :"+ i);
//        Assert.assertTrue(1==2,"测试结果出错了，吧啦吧啦吧啦");
        MyAssert.verifyTrue(1==1,"测试结果出错了，吧啦吧啦吧啦");

    }

    @Test(expectedExceptions = RuntimeException.class)
//    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithRuntimeException() {
        Reporter.log("123456789");
        throw new RuntimeException("error");
    }

}
