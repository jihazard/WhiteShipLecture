package tesok.kr.whiteship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringInitApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringInitApplication.class,args);

       // new SpringApplicationBuilder().sources(SpringInitApplication.class).run(args);

        /*SpringApplication app = new SpringApplication(SpringInitApplication.class);
        app.run(args);*/
    }
}
