package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.OrderInputDomainRepository;
import com.probestack.forgestudio.design.model.OrderInput;
import com.probestack.forgestudio.design.persistence.mongodb.document.OrderInputDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.OrderInputMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class OrderInputMongoPersistenceAdapter implements OrderInputDomainRepository {
    private final OrderInputMongoRepository repository;

    public OrderInputMongoPersistenceAdapter(OrderInputMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public OrderInput save(OrderInput orderInput) {
        OrderInputDocument document = toDocument(orderInput);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<OrderInput> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<OrderInput> findAll() {
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

    private OrderInputDocument toDocument(OrderInput orderInput) {
        OrderInputDocument document = new OrderInputDocument();
        BeanUtils.copyProperties(orderInput, document);
        return document;
    }

    private OrderInput toDomain(OrderInputDocument document) {
        OrderInput domain = new OrderInput();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
