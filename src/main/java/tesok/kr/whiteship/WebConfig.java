package tesok.kr.whiteship;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addFormatters(FormatterRegistry registry) {
        //registry.addConverter(new EventConverter.stringToEventConverter()); 컨버터 추가하기
        registry.addFormatter(new EventFormatter());
    }
}
