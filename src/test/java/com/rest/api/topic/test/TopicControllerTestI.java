package com.rest.api.topic.test;


import static org.junit.Assert.fail;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TopicControllerTestI {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/topic/all");
    }

    @Test
    public void getTopics() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        if(response.getStatusCode()!=HttpStatus.OK) {
        	fail("ERROR en la petición");
        }else {
        	System.out.println("Petición exitiosa");
        }
    }
}