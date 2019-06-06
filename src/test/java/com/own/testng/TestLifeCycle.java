package com.own.testng;

import org.testng.annotations.*;

/**
 * @author zhi.zhao
 * @date 5/18/2019 12:29 PM
 * 钩子函数
 */
public class TestLifeCycle {
    @BeforeSuite(description = "测试BeforeSuite")
    public void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite(description = "测试AfterSuite")
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }

    @BeforeTest(description = "测试BeforeTest")
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest(description = "测试AfterTest")
    public void afterTest() {
        System.out.println("@AfterTest");
    }

    @BeforeClass()
    public void beforeClass(){
        System.out.println("@BeforeClass");
    }

    @AfterClass()
    public void afterClass(){
        System.out.println("@AfterClass");
    }

    @BeforeMethod()
    public void beforeMethod(){
        System.out.println("@BeforeMethod");
    }

    @AfterMethod()
    public void afterMethod(){
        System.out.println("@AfterMethod");
    }
}
