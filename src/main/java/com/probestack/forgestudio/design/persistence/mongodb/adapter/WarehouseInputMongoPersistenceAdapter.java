package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.WarehouseInputDomainRepository;
import com.probestack.forgestudio.design.model.WarehouseInput;
import com.probestack.forgestudio.design.persistence.mongodb.document.WarehouseInputDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.WarehouseInputMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class WarehouseInputMongoPersistenceAdapter implements WarehouseInputDomainRepository {
    private final WarehouseInputMongoRepository repository;

    public WarehouseInputMongoPersistenceAdapter(WarehouseInputMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public WarehouseInput save(WarehouseInput warehouseInput) {
        WarehouseInputDocument document = toDocument(warehouseInput);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<WarehouseInput> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<WarehouseInput> findAll() {
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

    private WarehouseInputDocument toDocument(WarehouseInput warehouseInput) {
        WarehouseInputDocument document = new WarehouseInputDocument();
        BeanUtils.copyProperties(warehouseInput, document);
        return document;
    }

    private WarehouseInput toDomain(WarehouseInputDocument document) {
        WarehouseInput domain = new WarehouseInput();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
