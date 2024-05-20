package cs307.cs30724springproject2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class Cs30724SpringProject2Application {
    public static void main(String[] args) {
        ConfigurableApplicationContext context =
                SpringApplication.run(Cs30724SpringProject2Application.class, args);
    }
}
