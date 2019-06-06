package com.own.testng.pojo;

import com.own.testng.utils.ClassUtil;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhi.zhao
 * @date 6/6/2019 3:22 PM
 */
public class MyAssert {
    public static boolean flag=true;
    public static List<Error> errors=new ArrayList();

    public static void verifyEquals(Object actual,Object expected){
        try{
            Assert.assertEquals(actual,expected);
        }catch(Error e){
            errors.add(e);
            flag=false;
        }
    }

    public static void verifyEquals(Object actual,Object expected,String message){
        try{
            Assert.assertEquals(actual, expected, message);
        }catch(Error e){
            errors.add(e);
            flag=false;
        }

    }
    public static void verifyNulls(Object actual,String message){
        try{
            Assert.assertNull(actual,message);
        }catch(Error e){
            errors.add(e);
            flag=false;
        }
    }

    public static void verifyTrue(Boolean bool,String message){
        try {
            Assert.assertTrue(bool);
        } catch (Error e) {
            StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
            StackTraceElement element = stacktrace[2];
            String className = element.getClassName();
            String methodName = element.getMethodName();
            String fileName = element.getFileName();
            int lineNumber = element.getLineNumber();
            Reporter.log("错误信息: "+message+" <br/> "+"类路径: "+className+"."+fileName+" <br/> "+"方法: "+methodName+"() <br/> "+"代码行数: "+lineNumber);
            throw e;
        }
    }
}
