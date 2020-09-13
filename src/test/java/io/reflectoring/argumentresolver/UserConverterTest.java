package io.reflectoring.argumentresolver;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = UserConverterTestController.class)
public class UserConverterTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private GitRepositoryFinder gitRepositoryFinder;

    @Test
    void postUser() throws Exception {
        mockMvc.perform(post("/User").contentType(MediaType.APPLICATION_JSON).content("{\"name\":\"matt\",\"age\":32}"))
                .andExpect(status().isOk());
    }

    @Test
    void getUser() throws Exception {
        mockMvc.perform(get("/User?name=matt1"))
                .andExpect(status().isOk());
    }
}
