package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.WarehouseInput;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for WarehouseInput domain operations.
 */
public interface WarehouseInputDomainRepository {
    WarehouseInput save(WarehouseInput warehouseInput);

    Optional<WarehouseInput> findById(String id);

    List<WarehouseInput> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
