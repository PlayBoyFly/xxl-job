package com.xxl.job.core.handler.annotation;

import java.lang.annotation.*;

/**
 * xxl-job的注解类
 * annotation for method jobhandler
 *
 * @author xuxueli 2019-12-11 20:50:13
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface XxlJob {

    /**
     * 任务名称
     * jobhandler name
     */
    String value();

    /**
     * 初始化，任务线程初始化的时候调用
     * init handler, invoked when JobThread init
     */
    String init() default "";

    /**
     * 销毁handler，当任务线程销毁的时候调用一次
     * destroy handler, invoked when JobThread destroy
     */
    String destroy() default "";

}
