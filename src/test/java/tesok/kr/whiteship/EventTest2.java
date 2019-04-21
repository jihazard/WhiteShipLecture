package tesok.kr.whiteship;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class EventTest2 {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void 이벤트2테스트() throws Exception {
        mockMvc.perform(get("/event3/2")).andExpect(status().isOk()).andExpect(content().string("2"));
    }

}
