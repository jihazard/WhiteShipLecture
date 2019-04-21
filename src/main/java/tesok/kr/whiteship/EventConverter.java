package tesok.kr.whiteship;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

public class EventConverter {
    @Component
    public static class stringToEventConverter implements Converter<String,Event> {
        @Override
        public Event convert(String s) {
            return new Event(Integer.parseInt(s));
        }
    }
    @Component
    public static class eventToStringConverter implements  Converter<Event,String> {

        @Override
        public String convert(Event event) {
            return event.getId().toString();
        }
    }
}
