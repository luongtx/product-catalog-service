package com.demo.product_catalog_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/health-check")
public class HealthController {

    @GetMapping
    public String get() {
        return "OK";
    }
}
