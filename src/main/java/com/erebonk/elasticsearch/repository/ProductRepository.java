package com.erebonk.elasticsearch.repository;

import com.erebonk.elasticsearch.domain.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Elasticsearch repository
 *
 * @author ilya
 * @version 1.2
 */
@Repository
public interface ProductRepository extends ElasticsearchRepository<Product, String> {

    List<Product> findAllByName(String name);

}
