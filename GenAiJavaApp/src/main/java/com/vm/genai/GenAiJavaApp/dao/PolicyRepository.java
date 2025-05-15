package com.vm.genai.GenAiJavaApp.dao;

import com.vm.genai.GenAiJavaApp.model.Policy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PolicyRepository extends JpaRepository<Policy, Long> {
    Optional<Policy> findById(Long policyId);
}