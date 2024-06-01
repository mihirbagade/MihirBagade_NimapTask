package com.example.nimaptask.repository;

import com.example.nimaptask.entity.Category;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends PagingAndSortingRepository<Category, Long> {
    List<Category> findAll();
    Optional<Category> findById(Long id);
    <S extends Category> S save(S category);
    void deleteById(Long id);
    boolean existsById(Long id);
}
