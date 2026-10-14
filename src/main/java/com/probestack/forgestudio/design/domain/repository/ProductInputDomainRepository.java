package com.probestack.forgestudio.design.domain.repository;

import com.probestack.forgestudio.design.model.ProductInput;
import java.util.List;
import java.util.Optional;

/**
 * Persistence-neutral repository port for ProductInput domain operations.
 */
public interface ProductInputDomainRepository {
    ProductInput save(ProductInput productInput);

    Optional<ProductInput> findById(String id);

    List<ProductInput> findAll();

    boolean existsById(String id);

    void deleteById(String id);

    long count();
}
