package com.acme.example;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertThat;

import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

/**
 * Created by ppilgrim on 08-Oct-2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ExampleApplication.class)
@WebAppConfiguration
@IntegrationTest({"server.port=0"})
public class HelloControllerIT {

    @Value("${local.server.port}")
    private int port;

    private URL hello;
    private RestTemplate template;

    @Before
    public void setUp() throws Exception {
        this.hello = new URL("http://localhost:" + port + "/hello");
        template = new TestRestTemplate();
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(hello.toString(), String.class);
        assertThat(response.getBody(), containsString("Greetings from Spring Boot!"));
    }
}

// End.
