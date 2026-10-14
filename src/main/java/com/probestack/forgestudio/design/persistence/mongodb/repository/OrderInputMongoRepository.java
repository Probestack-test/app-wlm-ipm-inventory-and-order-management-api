package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.OrderInputDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for OrderInput documents.
 */
public interface OrderInputMongoRepository extends MongoRepository<OrderInputDocument, String> {
}
