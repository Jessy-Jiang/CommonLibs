package com.jessy.tools.annotation.view.annotation.event;

import android.view.View;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@EventBase(
        listenerType = View.OnLongClickListener.class,
        listenerSetter = "setOnLongClickListener",
        methodName = "onLongClick")
public @interface OnLongClick {
    int[] value();

    int[] parentId() default 0;
}
