package com.own.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author zhi.zhao
 * @date 5/18/2019 3:55 PM
 */
public class TestParameter {

    @Test
    @Parameters({"username","password"})
    public void testParameter(String username,String password){
        System.out.println("username:"+username+";\npassword:"+password);
    }
}
