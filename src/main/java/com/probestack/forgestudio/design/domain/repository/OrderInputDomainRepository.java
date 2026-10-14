package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.OrderInput;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for OrderInput domain operations.
 */
public interface OrderInputDomainRepository {
    OrderInput save(OrderInput orderInput);

    Optional<OrderInput> findById(String id);

    List<OrderInput> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
