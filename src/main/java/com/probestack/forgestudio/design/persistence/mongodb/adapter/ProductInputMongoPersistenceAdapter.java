package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.ProductInputDomainRepository;
import com.probestack.forgestudio.design.model.ProductInput;
import com.probestack.forgestudio.design.persistence.mongodb.document.ProductInputDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.ProductInputMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ProductInputMongoPersistenceAdapter implements ProductInputDomainRepository {
    private final ProductInputMongoRepository repository;

    public ProductInputMongoPersistenceAdapter(ProductInputMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ProductInput save(ProductInput productInput) {
        ProductInputDocument document = toDocument(productInput);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<ProductInput> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<ProductInput> findAll() {
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

    private ProductInputDocument toDocument(ProductInput productInput) {
        ProductInputDocument document = new ProductInputDocument();
        BeanUtils.copyProperties(productInput, document);
        return document;
    }

    private ProductInput toDomain(ProductInputDocument document) {
        ProductInput domain = new ProductInput();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
