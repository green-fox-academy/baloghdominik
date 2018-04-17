package com.greenfoxacademy.baloghdominik.restbackend.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
        import com.fasterxml.jackson.core.JsonProcessingException;
        import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.baloghdominik.restbackend.RestbackendApplication;
import org.junit.Before;
        import org.junit.Test;
        import org.junit.runner.RunWith;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.boot.test.context.SpringBootTest;
        import org.springframework.http.MediaType;
        import org.springframework.test.context.junit4.SpringRunner;
        import org.springframework.test.context.web.WebAppConfiguration;
        import org.springframework.test.web.servlet.MockMvc;
        import org.springframework.test.web.servlet.setup.MockMvcBuilders;
        import org.springframework.web.context.WebApplicationContext;
        import org.springframework.web.servlet.config.annotation.EnableWebMvc;
        import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

        import java.nio.charset.Charset;

        import static org.hamcrest.core.Is.is;
        import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
        import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
        import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = RestbackendApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class ControllerTests {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Before
    public void setup() throws Exception {
        this.mockMvc = webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void appenda() throws Exception {
        mockMvc.perform(get("/appenda/martin"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.appended").value("martina"));
    }

    @Test
    public void doublingError() throws Exception {
        mockMvc.perform(get("/doubling"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.error").value("Please provide an input!"));
    }

    @Test
    public void isSum15() throws Exception {
        mockMvc
                .perform(post("/dountil/sum")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"until\": 5}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value(15));
    }

    @Test
    public void isFactor120() throws Exception {
        mockMvc
                .perform(post("/dountil/factor")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content("{\"until\": 5}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.result").value(120));
    }
}