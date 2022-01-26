package sys;


import entity.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.event.EventListener;
import services.GetAllOrders;
import services.ProductService;
import sys.config.MyConfig;

@SpringBootApplication

public class Application {

    private ProductService productService;

    public static void main(String[] args){
        SpringApplication.run(Application.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    private void testJpaMetods(){
        Product products = new Product();

        productService.findAll().forEach(it->System.out.println(it));


    }
}
