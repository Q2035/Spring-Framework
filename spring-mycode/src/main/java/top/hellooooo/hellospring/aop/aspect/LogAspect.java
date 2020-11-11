package top.hellooooo.hellospring.aop.aspect;

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
	public void logStart(){
		System.out.println("除法运行");
	}

	@After("pointCut()")
	public void logEnd(){
		System.out.println("除法结束");
	}

	@AfterReturning("pointCut()")
	public void logReturn(){
		System.out.println("正常返回");
	}

	@AfterThrowing("pointCut()")
	public void logException(){
		System.out.println("除法异常");
	}
}
