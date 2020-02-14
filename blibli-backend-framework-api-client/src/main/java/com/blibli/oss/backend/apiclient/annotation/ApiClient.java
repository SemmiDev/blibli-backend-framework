package com.blibli.oss.backend.apiclient.annotation;

import com.blibli.oss.backend.apiclient.interceptor.ApiClientInterceptor;

import java.lang.annotation.*;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ApiClient {

  String name();

  Class<?> fallback() default Void.class;

  boolean primary() default true;

  Class<? extends ApiClientInterceptor>[] interceptors() default {};

}
