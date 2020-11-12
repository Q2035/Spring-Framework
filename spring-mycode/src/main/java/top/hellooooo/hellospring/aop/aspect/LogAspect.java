package top.hellooooo.hellospring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Author Q
 * @Date 11/11/2020 08:13
 * @Description
 */
@Aspect
public class LogAspect {

	@Pointcut("execution(public int top.hellooooo.hellospring.aop.bean.MathCalculator.div(int,int))")
	public void pointCut(){
	}

	@Before("pointCut()")
	public void logStart(JoinPoint joinPoint) {
		String name = joinPoint.getSignature().getName();
		Object[] args = joinPoint.getArgs();
		System.out.println(name + " with" + args);
		System.out.println("除法运行");
	}

	@After("pointCut()")
	public void logEnd(){
		System.out.println("除法结束");
	}

	@AfterReturning(value = "pointCut()",returning = "returnVal")
	public void logReturn(Object returnVal){
		System.out.println("正常返回" + " with " + returnVal);
	}

	@AfterThrowing(value = "pointCut()",throwing = "exception")
	public void logException(Exception exception){
		System.out.println("除法异常");
	}
}
