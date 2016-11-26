package com.ksit.test.object;

import java.util.Date;

/**
 * Created by hanxiaowei on 2016/11/4.
 */
public class ObjTestMain {

    public static void main(String[] a){
        System.out.println("===begin");

        //先看看，String的方法
        String s = new String("test3333");
        out(s.hashCode()+"");

        //先看看，Integer的方法
        Integer i = new Integer(3);
        out(i.hashCode()+"");


//先看看，Integer的方法
        Date d = new Date();
        out(d.hashCode()+"");

        String  sss = "3";



        System.out.println("===end");


    }

    static void out(String s){
        System.out.println(s);
    }

}
