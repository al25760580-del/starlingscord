package org.jni_zero;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.CONSTRUCTOR, ElementType.METHOD})
@UsedReflectively
@Retention(RetentionPolicy.CLASS)
public @interface CalledByNativeForTesting {
    String value() default "";
}
