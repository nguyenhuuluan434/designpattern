package com.lsa.design_pattern.designpattern.creational;

import com.lsa.design_pattern.designpattern.creational.misc.Reflection;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflection {

    @Test
    public void TestReflection() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final Reflection obj = new Reflection();
        Class cls = obj.getClass();
        System.out.println("The name of class is " +
                cls.getName());

        Constructor constructor = cls.getConstructor();
        System.out.println("The name of constructor is " +
                constructor.getName());

        Method[] methods = cls.getMethods();

        for (Method method:methods)
            System.out.println(method.getName());

        Method method1 = cls.getMethod("method1");
        method1.invoke(obj);


        Method method2 = cls.getDeclaredMethod("method2",
                int.class);

        method2.invoke(obj, 19);
    }
}
