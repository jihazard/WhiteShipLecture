package tesok.kr.whiteship;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class MyEventHandler  {
    @EventListener
    //@Order(Ordered.HIGHEST_PRECEDENCE+10)
    @Async
    public void onApplicationEvent(MyEvent myEvent) {
        System.out.println(Thread.currentThread().toString());
        System.out.println("이벤트 받음 : " + myEvent.getData() +"//");
    }
}
