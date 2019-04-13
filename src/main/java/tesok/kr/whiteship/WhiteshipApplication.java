package tesok.kr.whiteship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:/app.properties")
public class WhiteshipApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhiteshipApplication.class, args);
    }

}
