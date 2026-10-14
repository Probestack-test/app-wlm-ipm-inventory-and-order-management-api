package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.LoginRequestDomainRepository;
import com.probestack.forgestudio.design.model.LoginRequest;
import com.probestack.forgestudio.design.persistence.mongodb.document.LoginRequestDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.LoginRequestMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class LoginRequestMongoPersistenceAdapter implements LoginRequestDomainRepository {
    private final LoginRequestMongoRepository repository;

    public LoginRequestMongoPersistenceAdapter(LoginRequestMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public LoginRequest save(LoginRequest loginRequest) {
        LoginRequestDocument document = toDocument(loginRequest);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<LoginRequest> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<LoginRequest> findAll() {
        return repository.findAll().stream().map(this::toDomain).toList();
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public void deleteById(String id) {
        repository.deleteById(id);
    }

    @Override
    public long count() {
        return repository.count();
    }

    private LoginRequestDocument toDocument(LoginRequest loginRequest) {
        LoginRequestDocument document = new LoginRequestDocument();
        BeanUtils.copyProperties(loginRequest, document);
        return document;
    }

    private LoginRequest toDomain(LoginRequestDocument document) {
        LoginRequest domain = new LoginRequest();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
