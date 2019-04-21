package tesok.kr.whiteship;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@RunWith(SpringRunner.class)
@WebMvcTest({EventConverter.stringToEventConverter.class,EventController.class})
public class EventControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void getEvent() throws Exception {
        mockMvc.perform(get("/event/1")).andExpect(status().isOk()).andExpect(content().string("1"));
    }

    @Test
    public void 이벤트2테스트() throws Exception {
        mockMvc.perform(get("/event3/2")).andExpect(status().isOk()).andExpect(content().string("2"));
    }

}