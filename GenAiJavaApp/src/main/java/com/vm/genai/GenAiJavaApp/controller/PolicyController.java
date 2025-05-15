package com.vm.genai.GenAiJavaApp.controller;

import com.vm.genai.GenAiJavaApp.model.Policy;
import com.vm.genai.GenAiJavaApp.service.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/policies")
public class PolicyController {

    @Autowired
    private PolicyService policyService;

    @GetMapping("/{policyId}")
    public ResponseEntity<Policy> getPolicyById(@PathVariable Long policyId) {
        Optional<Policy> policy = policyService.getPolicyById(policyId);
        return policy.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @GetMapping("/status")
    public String getStatus() {
        return "Policy Service is running";
    }
}