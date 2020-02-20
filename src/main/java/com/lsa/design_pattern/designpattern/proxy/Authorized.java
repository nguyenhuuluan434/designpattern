package com.lsa.design_pattern.designpattern.proxy;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Authorized {
    String[] allowed();
}
