package com.probestack.forgestudio.design.persistence.mongodb.repository;

import com.probestack.forgestudio.design.persistence.mongodb.document.LoginRequestDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Spring Data MongoDB repository for LoginRequest documents.
 */
public interface LoginRequestMongoRepository extends MongoRepository<LoginRequestDocument, String> {
}
