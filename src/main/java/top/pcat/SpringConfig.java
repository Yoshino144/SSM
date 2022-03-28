package top.pcat;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //取代配置xml
@ComponentScan(basePackages = "top.pcat.entity")
public class SpringConfig {

}
