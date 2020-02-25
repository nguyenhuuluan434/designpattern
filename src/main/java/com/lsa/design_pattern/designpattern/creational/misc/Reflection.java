package com.lsa.design_pattern.designpattern.creational.misc;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Reflection {
    private String s;

    public Reflection() {
        this.s = "Default constructor";
    }

    public Reflection(String s) {
        this.s = s;
    }

    public void method1() {
        System.out.println("The string is " + s);
    }

    // Creating a public method with int as argument
    public void method2(int n) {
        System.out.println("The number is " + n);
    }

    // creating a private method
    private void method3() {
        System.out.println("Private method invoked");
    }
}
