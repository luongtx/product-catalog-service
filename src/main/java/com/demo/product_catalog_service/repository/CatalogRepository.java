package com.demo.product_catalog_service.repository;

import com.demo.product_catalog_service.model.Catalog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface CatalogRepository extends MongoRepository<Catalog, String> {
    @Query(value = "{id:'?0'}")
    Catalog findCatalogById(String id);
}
