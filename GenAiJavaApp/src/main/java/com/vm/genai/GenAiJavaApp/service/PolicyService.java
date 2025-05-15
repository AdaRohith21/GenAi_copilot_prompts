package com.vm.genai.GenAiJavaApp.service;

import com.vm.genai.GenAiJavaApp.dao.PolicyRepository;
import com.vm.genai.GenAiJavaApp.model.Policy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    public Optional<Policy> getPolicyById(Long policyId) {
        return policyRepository.findById(policyId);
    }
}