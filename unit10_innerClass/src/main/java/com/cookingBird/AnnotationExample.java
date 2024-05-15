package com.cookingBird;

import java.lang.annotation.*;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class AnnotationExample {

    public static void main(String[] args) throws NoSuchMethodException {
        // 获取方法对象
        Method method = AnnotationExample.class.getMethod("exampleMethod", String.class, int.class);

        // 获取方法的参数列表
        Parameter[] parameters = method.getParameters();

        // 遍历参数列表
        for (Parameter parameter : parameters) {
            // 获取参数上的所有注解
            Annotation[] annotations = parameter.getAnnotations();

            // 打印参数名和注解信息
            System.out.println("Parameter: " + parameter.getName());
            System.out.println(annotations.length);
            for (Annotation annotation : annotations) {
                System.out.println(annotation.getClass());
                System.out.println("Annotation on parameter: " + annotation.toString());
            }
        }
    }

    // 示例方法，带有参数和注解
    public void exampleMethod(@MyAnnotation("hello") String str, @MyAnnotation("world") int num) {
        // 方法体
    }
}

// 自定义注解
@Target(ElementType.PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {
    String value() default "";
    // 注解内容
}

