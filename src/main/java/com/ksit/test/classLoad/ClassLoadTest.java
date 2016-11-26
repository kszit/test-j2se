package com.ksit.test.classLoad;

import sun.misc.ClassLoaderUtil;

/**
 * Created by hanxiaowei on 2016/11/7.
 */
public class ClassLoadTest
{

    public static void main(String[] a){

        ClassLoader classLoader = ClassLoadTest.class.getClassLoader();

        System.out.format("%s\n",classLoader);
        System.out.format("%s\n",classLoader.getResource("2"));
    }

}
