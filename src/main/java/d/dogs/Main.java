package d.dogs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"d.dogs.api", "d.dogs.service"})
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}