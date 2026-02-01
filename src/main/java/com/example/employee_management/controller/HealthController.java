package com.example.employee_management.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/health")
public class HealthController {

    // GET → Check application status
    @GetMapping
    public Map<String, String> healthCheck() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "UP");
        response.put("service", "Employee Management Service");
        return response;
    }

    // POST → Accept health-related message
    @PostMapping
    public Map<String, String> healthPost(@RequestBody Map<String, String> request) {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Health POST received");
        response.put("input", request.getOrDefault("message", "no message"));
        return response;
    }

    // PUT → Update health status (mock)
    @PutMapping
    public Map<String, String> healthPut(@RequestBody Map<String, String> request) {
        Map<String, String> response = new HashMap<>();
        response.put("updatedStatus", request.getOrDefault("status", "UNKNOWN"));
        response.put("result", "Health status updated successfully");
        return response;
    }
}

