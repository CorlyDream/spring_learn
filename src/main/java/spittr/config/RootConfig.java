package spittr.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.remoting.rmi.RmiServiceExporter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import spittr.service.DefaultValueService;

@Configuration
@ComponentScan(basePackages={"spittr"}, 
		excludeFilters={@Filter(type=FilterType.ANNOTATION, value=EnableWebMvc.class)})
public class RootConfig {

	@Bean
	public RmiServiceExporter rmiServiceExporter(DefaultValueService defaultValueService){
		RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
		rmiServiceExporter.setService(defaultValueService);
		rmiServiceExporter.setServiceName("DefaultValueService");
		rmiServiceExporter.setServiceInterface(DefaultValueService.class);
		return rmiServiceExporter;
	}
}
