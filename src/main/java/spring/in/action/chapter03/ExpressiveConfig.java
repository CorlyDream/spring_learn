package spring.in.action.chapter03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

/**
 * Created by mengshuang on 2017/7/7.
 */
@Configuration
@PropertySource("classpath:app.properties")
public class ExpressiveConfig {

    @Autowired
    Environment environment;

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ExpressiveConfig.class);
        ExpressiveConfig ec = context.getBean(ExpressiveConfig.class);
        String url = ec.environment.getProperty("url");
        System.out.println(url);

    }
}
