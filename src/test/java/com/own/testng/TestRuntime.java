package com.own.testng;

import org.testng.annotations.Test;

/**
 * @author zhi.zhao
 * @date 5/18/2019 2:11 PM
 * 异常处理
 */
public class TestRuntime {

    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithException() {
        int i = 1 / 0;
        System.out.println("After division the value of i is :"+ i);
    }

    @Test(expectedExceptions = RuntimeException.class)
//    @Test(expectedExceptions = ArithmeticException.class)
    public void divisionWithRuntimeException() {
        throw new RuntimeException("error");
    }

}
