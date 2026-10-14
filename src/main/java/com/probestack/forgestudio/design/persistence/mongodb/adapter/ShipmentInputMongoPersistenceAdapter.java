package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.ShipmentInputDomainRepository;
import com.probestack.forgestudio.design.model.ShipmentInput;
import com.probestack.forgestudio.design.persistence.mongodb.document.ShipmentInputDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.ShipmentInputMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class ShipmentInputMongoPersistenceAdapter implements ShipmentInputDomainRepository {
    private final ShipmentInputMongoRepository repository;

    public ShipmentInputMongoPersistenceAdapter(ShipmentInputMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ShipmentInput save(ShipmentInput shipmentInput) {
        ShipmentInputDocument document = toDocument(shipmentInput);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<ShipmentInput> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<ShipmentInput> findAll() {
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

    private ShipmentInputDocument toDocument(ShipmentInput shipmentInput) {
        ShipmentInputDocument document = new ShipmentInputDocument();
        BeanUtils.copyProperties(shipmentInput, document);
        return document;
    }

    private ShipmentInput toDomain(ShipmentInputDocument document) {
        ShipmentInput domain = new ShipmentInput();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
