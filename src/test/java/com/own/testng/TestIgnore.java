package com.own.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @author zhi.zhao
 * @date 5/18/2019 2:21 PM
 * 测试忽略方法
 */
public class TestIgnore {
    @Test // default enable=true
    public void test1() {
        System.out.println("test1");
        Assert.assertEquals(true, true);
    }

    @Test(description = "这是test2",enabled = true)
    public void test2() {
        System.out.println("test2");
        Assert.assertEquals(true, true);
    }

    @Test(enabled = false)
    public void test3() {
        System.out.println("test3");
        Assert.assertEquals(true, true);
    }
}
