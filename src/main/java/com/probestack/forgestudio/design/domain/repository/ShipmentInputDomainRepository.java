package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.ShipmentInput;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for ShipmentInput domain operations.
 */
public interface ShipmentInputDomainRepository {
    ShipmentInput save(ShipmentInput shipmentInput);

    Optional<ShipmentInput> findById(String id);

    List<ShipmentInput> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
