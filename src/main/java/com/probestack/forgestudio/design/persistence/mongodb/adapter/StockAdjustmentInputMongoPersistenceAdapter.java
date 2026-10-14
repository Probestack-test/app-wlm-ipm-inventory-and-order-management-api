package com.probestack.forgestudio.design.persistence.mongodb.adapter;

import com.probestack.forgestudio.design.domain.repository.StockAdjustmentInputDomainRepository;
import com.probestack.forgestudio.design.model.StockAdjustmentInput;
import com.probestack.forgestudio.design.persistence.mongodb.document.StockAdjustmentInputDocument;
import com.probestack.forgestudio.design.persistence.mongodb.repository.StockAdjustmentInputMongoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

@Component
public class StockAdjustmentInputMongoPersistenceAdapter implements StockAdjustmentInputDomainRepository {
    private final StockAdjustmentInputMongoRepository repository;

    public StockAdjustmentInputMongoPersistenceAdapter(
            StockAdjustmentInputMongoRepository repository) {
        this.repository = repository;
    }

    @Override
    public StockAdjustmentInput save(StockAdjustmentInput stockAdjustmentInput) {
        StockAdjustmentInputDocument document = toDocument(stockAdjustmentInput);
        return toDomain(repository.save(document));
    }

    @Override
    public Optional<StockAdjustmentInput> findById(String id) {
        return repository.findById(id).map(this::toDomain);
    }

    @Override
    public List<StockAdjustmentInput> findAll() {
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

    private StockAdjustmentInputDocument toDocument(StockAdjustmentInput stockAdjustmentInput) {
        StockAdjustmentInputDocument document = new StockAdjustmentInputDocument();
        BeanUtils.copyProperties(stockAdjustmentInput, document);
        return document;
    }

    private StockAdjustmentInput toDomain(StockAdjustmentInputDocument document) {
        StockAdjustmentInput domain = new StockAdjustmentInput();
        BeanUtils.copyProperties(document, domain);
        return domain;
    }
}
