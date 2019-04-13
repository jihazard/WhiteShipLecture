package tesok.kr.whiteship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Locale;
import java.util.Properties;

@Component
public class AppRunner implements ApplicationRunner {

    @Autowired
    MessageSource messageSource;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(messageSource.getMessage("greeting",new String[]{"지환"}, new Locale("ko")));

        System.out.println(messageSource.getMessage("greeting",new String[]{"지환"},Locale.getDefault()));
    }
}

