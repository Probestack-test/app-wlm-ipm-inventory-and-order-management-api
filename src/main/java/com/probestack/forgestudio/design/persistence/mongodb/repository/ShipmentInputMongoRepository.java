package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.ShipmentInputDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for ShipmentInput documents.
 */
public interface ShipmentInputMongoRepository extends MongoRepository<ShipmentInputDocument, String> {
}
