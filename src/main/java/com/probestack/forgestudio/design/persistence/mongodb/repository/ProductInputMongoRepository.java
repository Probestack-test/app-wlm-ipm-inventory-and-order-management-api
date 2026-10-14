package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.ProductInputDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for ProductInput documents.
 */
public interface ProductInputMongoRepository extends MongoRepository<ProductInputDocument, String> {
}
