package app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan({"model,controller,db"}) // search the com.company package for @Component classes
@ImportResource("classpath:/beans.xml") // XML with DataSource bean
public class WebAppConfig {

}
