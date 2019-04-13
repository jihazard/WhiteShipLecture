package tesok.kr.whiteship;

import org.springframework.context.event.EventListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class OtherHandler {
    @EventListener
    //@Order(Ordered.HIGHEST_PRECEDENCE+100) //순서
    @Async //비동기
    public void handler (MyEvent myEvent){
        System.out.println(Thread.currentThread().toString());

        System.out.println("이것도 처리가 되나요? :"+ myEvent.getData());
    }
}
