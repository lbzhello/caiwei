package xyz.lius.mvc.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopProxyTest {
    @Pointcut("execution(* xyz.lius.mvc.bean.*.*(..))")
    public void pointcut() {
    }

    @Before("pointcut()")
    public void before() {
        System.out.println("aop before");
    }

}