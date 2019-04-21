package tesok.kr.whiteship;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

/*
    // 이벤트 바인더
    @InitBinder
    public void init (WebDataBinder webDataBinder){
        webDataBinder.registerCustomEditor(Event.class, new EventEditor());
    }*/

    @GetMapping("/event/{event}")
    public String getEvent(@PathVariable Event event ){
        System.out.println(event);
        return event.getId().toString();
    }

    @GetMapping("/event2/{id}")
    public String getEvent2(@PathVariable Integer id ){
        System.out.println(id);
        return String.valueOf(id);
    }

    @GetMapping("/event3/{event}")
    public String getEvent3(@PathVariable Event event ){
        System.out.println(event);
        return event.getId().toString();
    }


}
