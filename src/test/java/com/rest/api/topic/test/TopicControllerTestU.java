package com.rest.api.topic.test;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


//Class used for making Unit Test
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class TopicControllerTestU {

    @Autowired
    private MockMvc mvc;

    @Test
    public void getTopics() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/tofpic/all"))
                .andExpect(status().isOk());
    }
}