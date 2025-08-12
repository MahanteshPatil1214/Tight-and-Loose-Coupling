package car.example.componentscan.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "car.example.componentscan.annotation")
public class AppConfig {

}
