package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.StockAdjustmentInputDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for StockAdjustmentInput documents.
 */
public interface StockAdjustmentInputMongoRepository extends MongoRepository<StockAdjustmentInputDocument, String> {
}
