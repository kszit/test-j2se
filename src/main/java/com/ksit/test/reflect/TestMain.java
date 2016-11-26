package com.ksit.test.reflect;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by hanxiaowei on 2016/11/4.
 */
public class TestMain {

    public static void main(String[] a)throws  Exception{

        System.out.println("begin");


        Class c = Class.forName("java.lang.Integer");
        System.out.println(c.getSimpleName());
        System.out.println(c.getName());

        //类的 字段
        for(Field field:c.getFields()){
            System.out.println(field.getGenericType());
            System.out.println(field.getName());
            //获得字段后，可以设置（访问）此类对应的对象的私有字段值
            //field.setInt(obj,1);
        }


        //类内部的 类或者接口
        for(Class class1:c.getDeclaredClasses()){
            System.out.println(class1.getName());
        }

        //获得类的所有方法
        for(Method method:c.getDeclaredMethods()){

            System.out.println(method.getName());

        }





        System.out.println("end");


        //类实例化

        Class  aClass = A.class;
        //抛出异常，instance只能实例化 无参的构造方法
        //Object aObj = aClass.newInstance();

        //构造方法
        for(Constructor cons:aClass.getDeclaredConstructors()){

            System.out.println(cons.getParameterTypes().length);

        }

        //有参构造方法  创建对象
        Constructor constructor = aClass.getConstructor(Integer.class);
        Object o = constructor.newInstance(1);



        //数组
        Object objArray = Array.newInstance(String.class,3);
        //设置值
        Array.set(objArray,0,"test-str");
        System.out.println(Array.get(objArray,0));

    }

    static class A{
        public A(Integer a){

        }
        public A(String s,int a){

        }
    }
}
