package top.hellooooo.sourcecode.charpter07.bean;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Author Q
 * @Date 04/08/2020 08:56
 * @Description
 */
@Aspect
public class AspectJTest {
	@Pointcut("execution(* *..test(..)")
	public void test(){

	}

	@Before("test")
	public void beforeTest(){
		System.out.println("beforeTest");
	}

	@After("test")
	public void afterTest(){
		System.out.println("afterTest");
	}

	@Around("test")
	public Object aroundTest(ProceedingJoinPoint joinPoint) {
		System.out.println("before1");
		Object o = null;
		try {
			o = joinPoint.proceed();
		} catch (Throwable throwable) {
			throwable.printStackTrace();
		}
		System.out.println("after1");
		return o;
	}
}
