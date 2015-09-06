package com.jessy.tools.annotation.view.annotation;


import com.jessy.tools.annotation.view.ResType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ResInject {
    int id();

    ResType type();
}
