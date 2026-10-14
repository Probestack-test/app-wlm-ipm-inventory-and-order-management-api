package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.WarehouseInputDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for WarehouseInput documents.
 */
public interface WarehouseInputMongoRepository extends MongoRepository<WarehouseInputDocument, String> {
}
