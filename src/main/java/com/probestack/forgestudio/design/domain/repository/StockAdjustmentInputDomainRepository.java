package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.StockAdjustmentInput;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for StockAdjustmentInput domain operations.
 */
public interface StockAdjustmentInputDomainRepository {
    StockAdjustmentInput save(StockAdjustmentInput stockAdjustmentInput);

    Optional<StockAdjustmentInput> findById(String id);

    List<StockAdjustmentInput> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
