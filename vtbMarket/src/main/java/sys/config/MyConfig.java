package sys.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.GetAllOrders;
import sys.Logger;

@Configuration
public class MyConfig{

    @Bean
    public GetAllOrders getAllOrders(){
        return new GetAllOrders();
   }

    @Bean
    public Logger logger (){
        return new Logger();
    }
}
