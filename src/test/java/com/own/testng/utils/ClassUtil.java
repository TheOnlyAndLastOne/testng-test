package com.own.testng.utils;

import java.net.URL;

/**
 * @author zhi.zhao
 * @date 6/6/2019 3:43 PM
 */
public class ClassUtil {
    public static void getClassInfo() {
        StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
        StackTraceElement element = stacktrace[2];
        String className = element.getClassName();
        String methodName = element.getMethodName();
        String fileName = element.getFileName();
        int lineNumber = element.getLineNumber();
        String path= element.getClass().getResource("/").getPath();
        System.out.println("错误信息:123"+" \"<br/>\" "+"类路径:"+className+"."+fileName+" \"<br/>\" "+"方法:"+methodName+" \"<br/>\" "+"代码行数:"+lineNumber);
        System.out.println("path:"+path);
        System.out.println(System.getProperty("user.dir"));

    }
}
