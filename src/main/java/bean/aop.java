package bean;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class aop {
    @Pointcut("execution(* bean.student.*(..))")
    public void pt(){

    }
    @Before("pt()")
    public void before(){
        System.out.println("before-------------------");
    }
}
