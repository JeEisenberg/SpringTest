package com.gavin.myAspect;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Aspect//定义为切面
@Component//定义Bean
public class myAspect {
   @Pointcut("execution(* com.gavin.Dao.*.*(..))")//切入点
    public void myPointCut(){
    }
  @Before(value ="myPointCut()")
    public void myBefore(JoinPoint joinPoint) throws Throwable {
        System.out.println("前置通知");
    }
@AfterReturning(value = "myPointCut()",returning = "joinPoint")
    public void myAfterReturning(JoinPoint joinPoint) throws Throwable {
    System.out.println("后置通知");
    }
    @Around(value = "myPointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕通知开始");
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束");
        return proceed;
    }
    @AfterThrowing(value = "myPointCut()" ,throwing = "e")
    public void myThrowing(JoinPoint joinPoint,Throwable e) throws Throwable {
        System.out.println("有异常--"+e.getMessage());
    }
@After(value="myPointCut()")
    public void myAfter(JoinPoint joinPoint) throws Throwable {
    System.out.println("最终通知");
    }
}
