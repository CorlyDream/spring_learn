package spittr.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;

import com.github.pagehelper.PageHelper;

@Configuration
@MapperScan("spittr.mapper")
public class DataConfig {
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
    public DataSourceTransactionManager transactionManager()  {
        return new DataSourceTransactionManager(dataSource());
    }
     
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory() throws Exception{
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        sessionFactory.setTypeAliasesPackage("spittr.entity");
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*.xml"));
        Interceptor[] plugins = {getPageHelperConfig()};
        sessionFactory.setPlugins(plugins);
        sessionFactory.setConfiguration(getConfiguration());
        return sessionFactory;
    }
    
    public org.apache.ibatis.session.Configuration getConfiguration(){
    	org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        return configuration;
    }
    
    public Interceptor getPageHelperConfig(){
    	Properties p = new Properties();
    	p.setProperty("dialect", "mysql");
    	p.setProperty("offsetAsPageNum", "true");
    	p.setProperty("rowBoundsWithCount", "true");
    	p.setProperty("pageSizeZero", "true");
    	p.setProperty("reasonable", "true");
    	p.setProperty("params", "pageNum=start;pageSize=limit;");
    	PageHelper pageHelper = new PageHelper();
    	pageHelper.setProperties(p);
    	return pageHelper;
    }
}
