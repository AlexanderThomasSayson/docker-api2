package com.sllrc.api2.docker_api2.controller;

import com.sllrc.api2.docker_api2.service.Api2Service;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Api2Controller {

    private final Api2Service api2Service;

    public Api2Controller(Api2Service api2Service) {
        this.api2Service = api2Service;
    }

    @GetMapping("/api2/get-api4")
    public ResponseEntity<?> getApi4Data() {
        try {
            ResponseEntity<String> api4Response = api2Service.getApi4Data();
            return ResponseEntity.ok(api4Response.getBody());
        } catch (Exception e) {
            return ResponseEntity.status(500).body("Error: " + e.getMessage());
        }
    }
}
