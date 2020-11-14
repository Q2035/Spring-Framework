package top.hellooooo.tx.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @Author Q
 * @Date 14/11/2020 18:28
 * @Description
 * 声明式事务
 * 1. @Transactional
 * 2. @EnableTransactionManagement
 * 3. 注册事务管理器
 *			比如 DataSourceTransactionManager
 */
@Configuration
@ComponentScan("top.hellooooo.tx")
@EnableTransactionManagement // 开启基于注解的事务管理功能
public class TxConfig {

	// 配置数据源
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setPassword("root");
		driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/test?serverTimezone=Asia/Shanghai");
		return driverManagerDataSource;
	}

	// 简化增删查改操作
	@Bean
	public JdbcTemplate jdbcTemplate(){
		// Spring对Configuration配置文件有特殊处理，dataSource方法用于添加Bean组件
		// 再次调用表示从容器中获取该组件而不是再添加一遍组件
		return new JdbcTemplate(dataSource());
	}

	@Bean
	public PlatformTransactionManager transactionManager(DataSource dataSource){
		return new DataSourceTransactionManager(dataSource);
	}

}
