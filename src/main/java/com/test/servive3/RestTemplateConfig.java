package com.test.servive3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
	
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
    
    

}
