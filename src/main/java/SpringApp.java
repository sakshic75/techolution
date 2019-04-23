
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;



@ComponentScan("controller")
@SpringBootApplication
public class SpringApp {



    public static void main(String[] args) {
        SpringApplication.run(SpringApp.class, args);
    }

}