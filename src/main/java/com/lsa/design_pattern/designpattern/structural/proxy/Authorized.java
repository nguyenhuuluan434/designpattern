package com.lsa.design_pattern.designpattern.structural.proxy;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Authorized {
    String[] allowed();
}
