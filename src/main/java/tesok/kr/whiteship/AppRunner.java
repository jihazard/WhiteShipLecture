package tesok.kr.whiteship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Component;
import org.springframework.validation.BeanPropertyBindingResult;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.util.Arrays;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ResourceLoader resourceLoader;

    @Autowired
    Validator validator;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("호출 클래스 : " + validator.getClass());

        Book book = new Book();
        Errors errors = new BeanPropertyBindingResult(book,"book");

        validator.validate(book,errors);

        errors.getAllErrors().forEach(e ->{
                    System.out.println(e.getDefaultMessage());
                    Arrays.stream(e.getCodes()).forEach(code-> {
                        System.out.println("받은에러 코드 : " + code);

                    });

                }
        );



    }
}
