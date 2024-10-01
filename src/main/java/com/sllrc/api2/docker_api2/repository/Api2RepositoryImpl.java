package com.sllrc.api2.docker_api2.repository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class Api2RepositoryImpl implements Api2Repository {

    private final RestTemplate restTemplate;

    public Api2RepositoryImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @Override
    public ResponseEntity<String> getApi4Data() {
        // Call API 4 to get the name field
        String api4Url = "http://192.168.254.140:8080/get-api4";
        return restTemplate.getForEntity(api4Url, String.class);
    }
}
