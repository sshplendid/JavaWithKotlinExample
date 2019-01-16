package hello.greeting;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class GreetingControllerTests {

    @Autowired
    GreetingController controller;

    @Autowired
    MockMvc mockMvc;


    @Test
    public void contextLoads() {
        assertThat(controller).isNotNull();
    }

    @Test
    public void whenGetGreetingWithParam_thenReturnHelloName() throws Exception {
        this.mockMvc.perform(get("/greeting")
                .param("name", "Shawn"))
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, Shawn!"))
                .andDo(print())
        ;
    }

    @Test
    public void whenGetGreetingWithoutParam_thenReturnHelloWorld() throws Exception {
        this.mockMvc.perform(get("/greeting")
        )
                .andExpect(status().isOk())
                .andExpect(content().string("Hello, world!"))
                .andDo(print())
        ;
    }
}
