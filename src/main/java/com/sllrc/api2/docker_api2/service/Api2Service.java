package com.sllrc.api2.docker_api2.service;

import com.sllrc.api2.docker_api2.repository.Api2Repository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class Api2Service {

    private final Api2Repository api2Repository;

    public Api2Service(Api2Repository api2Repository) {
        this.api2Repository = api2Repository;
    }

    public ResponseEntity<String> getApi4Data() {
        return api2Repository.getApi4Data();
    }
}
