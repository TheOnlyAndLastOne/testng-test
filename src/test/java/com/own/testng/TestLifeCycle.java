package com.own.testng;

import org.testng.annotations.*;

/**
 * @author zhi.zhao
 * @date 5/18/2019 12:29 PM
 * 钩子函数
 */
public class TestLifeCycle {
    @BeforeSuite()
    public void beforeSuite() {
        System.out.println("@BeforeSuite");
    }

    @AfterSuite()
    public void afterSuite() {
        System.out.println("@AfterSuite");
    }

    @BeforeTest()
    public void beforeTest() {
        System.out.println("@BeforeTest");
    }

    @AfterTest()
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
