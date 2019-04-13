package tesok.kr.whiteship;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class WhiteshipApplication {

    public static void main(String[] args) {
        SpringApplication.run(WhiteshipApplication.class, args);
    }

    @Bean
    public MessageSource messageSource(){
        MessageSource messageSource= new ReloadableResourceBundleMessageSource();
        ((ReloadableResourceBundleMessageSource) messageSource).setBasename("classpath:/message");
        ((ReloadableResourceBundleMessageSource) messageSource).setDefaultEncoding("UTF-8");
        return messageSource;
    }
}
