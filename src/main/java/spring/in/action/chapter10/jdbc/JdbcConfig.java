package spring.in.action.chapter10.jdbc;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

@Configuration
@ComponentScan
public class JdbcConfig {
	@Bean
    public DataSource dataSource() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(com.mysql.jdbc.Driver.class);
        dataSource.setUsername("root");
        dataSource.setPassword("root");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/test?characterEncoding=UTF8&amp;zeroDateTimeBehavior=convertToNull&serverTimezone=GMT%2b8");
        return dataSource;
    }
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(dataSource);
	}
	@Bean
	public DefaultValueDao defaultValueDao(JdbcTemplate jdbcTemplate){
		return new DefaultValueDao(jdbcTemplate);
	}
}
