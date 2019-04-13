package tesok.kr.whiteship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    ApplicationContext ctx;

    @Autowired
    BookRepository bookRepository;



    @Override
    public void run(ApplicationArguments args) throws Exception {
        Environment environment= ctx.getEnvironment();
         System.out.println(environment.getProperty("app.name")); //환경 변수불러오기
        System.out.println(environment.getProperty("app.info")); //환경 변수불러오기
        System.out.println(environment.getProperty("app.test")); //환경 변수불러오기

    }
}
