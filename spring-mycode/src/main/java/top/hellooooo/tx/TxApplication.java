package top.hellooooo.tx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import top.hellooooo.tx.config.TxConfig;
import top.hellooooo.tx.service.UserService;

/**
 * @Author Q
 * @Date 14/11/2020 18:40
 * @Description
 */
public class TxApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(TxConfig.class);
		UserService userService = applicationContext.getBean(UserService.class);
		userService.insertUser();
	}
}
