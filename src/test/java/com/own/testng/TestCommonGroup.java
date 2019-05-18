package com.own.testng;

import org.testng.annotations.Test;

/**
 * @author zhi.zhao
 * @date 5/18/2019 3:17 PM
 * 测试整个类分组
 */
@Test(groups = "selenium-common")
public class TestCommonGroup {
    public void seleniumCommon1() {
        System.out.println("seleniumCommon1()");
    }

    public void seleniumCommon2() {
        System.out.println("seleniumCommon2()");
    }

    @Test(groups = "selenium-common-test")
    public void seleniumCommon3(){
        System.out.println("seleniumCommon3()");
    }
}
