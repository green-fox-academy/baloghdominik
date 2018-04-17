package com.greenfoxacademy.baloghdominik.groot.controllers;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.greenfoxacademy.baloghdominik.groot.GrootApplication;
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
@SpringBootTest(classes = GrootApplication.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {

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
    public void groot() throws Exception {
        mockMvc.perform(get("/groot")
                .param("message", "test"))
                .andExpect(status().isOk())
                .andExpect( jsonPath("$.received").value("test"))
                .andExpect( jsonPath("$.translated").value("I am Groot!"));
    }

    @Test
    public void grootError() throws Exception {
        mockMvc.perform(get("/groot"))
                .andExpect(status().isOk())
                .andExpect( jsonPath("$.error").value("I am Groot!"));
    }

    @Test
    public void yondu() throws Exception {
        mockMvc.perform(get("/yondu")
                .param("distance", "100")
                .param("time", "10"))
                .andExpect(status().isOk())
                .andExpect( jsonPath("$.distance").value(100.0))
                .andExpect( jsonPath("$.time").value(10.0))
                .andExpect( jsonPath("$.speed").value(10.0));
    }

    @Test
    public void yonduError() throws Exception {
        mockMvc.perform(get("/yondu"))
                .andExpect(status().is4xxClientError());
    }

}