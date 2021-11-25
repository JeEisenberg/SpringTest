package com.gavin.myAspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class MyAspect {
 @Pointcut("execution(* com.gavin.Dao.*.*(..))")
 public void myPointCut(){}
 @Before("myPointCut()")
 public void myBefore (JoinPoint joinPoint){
  System.out.print("前置通知---权限检查,");
  System.out.print("目标类--"+joinPoint.getTarget());
  System.out.println(",被植入的增强处理的目标方法为--"+joinPoint.getSignature().getName());
  }
@AfterReturning(value = "myPointCut()" ,returning = "joinPoint")
 public void myAfterReturning(JoinPoint joinPoint)  {
  System.out.println("后置通知,模拟日志记录");
  System.out.println(",被植入的增强处理的目标方法为--"+joinPoint.getSignature().getName());
 }

 /**
  *
  * @param proceedingJoinPoint
  * @return
  * @throws Throwable
  * @desc环绕通知必须接收一个类型为ProceedingJoinPoint的参数，
  * 返回值也必须是Object类型，且必须抛出异常。
  * 异常通知中可以传入Throwable类型的参数来输出异常信息。
  */

@Around(value = "myPointCut()" )
 public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
  System.out.println("环绕开始");
//  invoke current method
  Object proceed = proceedingJoinPoint.proceed();
  System.out.println("环绕结束");
  return proceed;
 }
@AfterThrowing(value =  "myPointCut()",throwing = "e")
 public void myAfterThrowing(JoinPoint joinPoint, Throwable e)  {
  System.out.println("出现异常:"+e.getMessage());
 }
@After(value = "myPointCut()")
 public void myAfter(JoinPoint joinPoint)  {
 System.out.println(joinPoint.getSignature().getName());
 System.out.println("最终通知:结束后释放资源");
 }
}
