package de.kozdemir.rickyandmortyapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpHeaders;
import org.springframework.web.client.RestTemplate;



@SpringBootApplication
public class RickyandmortyapiApplication {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
    @Bean
    public HttpHeaders httpHeaders(){
        return new HttpHeaders();
    }

    public static void main(String[] args) {
        SpringApplication.run(RickyandmortyapiApplication.class, args);
    }

}
