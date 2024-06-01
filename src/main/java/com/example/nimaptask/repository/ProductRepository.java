package com.example.nimaptask.repository;

import com.example.nimaptask.entity.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {
    
    Iterable<Product> findAll();
    
    Optional<Product> findById(Long id);
    
    <S extends Product> S save(S entity);
    
    void deleteById(Long id);
    boolean existsById(Long id);
}
