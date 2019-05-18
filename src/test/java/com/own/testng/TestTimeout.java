package com.own.testng;

import org.testng.annotations.Test;

/**
 * @author zhi.zhao
 * @date 5/18/2019 2:26 PM
 * 测试超时
 */
public class TestTimeout {
    @Test(timeOut = 5000) // time in mulliseconds
    public void testThisShouldPass() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test(timeOut = 1000)
    public void testThisShouldFail() {
        while (true){
            // do nothing
        }

    }
}
