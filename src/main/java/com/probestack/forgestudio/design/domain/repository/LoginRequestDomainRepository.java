package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.LoginRequest;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for LoginRequest domain operations.
 */
public interface LoginRequestDomainRepository {
    LoginRequest save(LoginRequest loginRequest);

    Optional<LoginRequest> findById(String id);

    List<LoginRequest> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
