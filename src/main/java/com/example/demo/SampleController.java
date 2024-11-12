package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;


@RestController
@RequestMapping("/api")
class SampleController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @GetMapping("/greet")
    public String greet() {
        return "Hello, welcome to the sample API!";
    }

    @GetMapping("/healthz")
    public String healthz() {
        return "OK";
    }

    @GetMapping("/testDb")
    public String testDb() {
        try {
            String result = jdbcTemplate.queryForObject("SELECT 'Hello from Local DB'", String.class);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
            return "Failed to connect to the database.";
        }
    }
}