package spring.in.action.chapter05.spitter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by mengshuang on 2017/7/10.
 */
@Configuration
@ComponentScan(basePackages = {"spring.in.action.chapter05.spitter.web"})
public class RootConfig {
}
