package customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;
import java.util.Map;

@Configuration
@ComponentScan(basePackages = "customer")
public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);

        RestControllerService restController = ctx.getBean(RestControllerService.class);
        Map<String, String> properties = loadProperties();
        System.out.println(restController.getCustomer("my-id"));
    }

    private static Map<String, String> loadProperties() {
        return Collections.singletonMap("sqlServerUrl", "localhost:765/sql");
    }
}