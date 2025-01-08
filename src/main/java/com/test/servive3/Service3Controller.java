package com.test.servive3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Service3Controller {
	
    @Autowired
    private RestTemplate restTemplate;
    
    @GetMapping("/callService1")
    public String callService1() {
        //String service1Url = "http://service1/hello";
	    String service1Url = "http://microservice-1-git:8081/hello";
        return restTemplate.getForObject(service1Url, String.class);
    }

}
