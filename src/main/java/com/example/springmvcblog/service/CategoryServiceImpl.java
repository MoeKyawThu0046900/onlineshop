package com.example.springmvcblog.service;

import com.example.springmvcblog.domain.Category;
import com.example.springmvcblog.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {

    private  final CategoryRepository categoryRepository;

    public CategoryServiceImpl(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category create(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category findbyID(int id) {
        //return categoryRepository.getOne(id);
        return categoryRepository.findById(id).orElseThrow(()->new EntityNotFoundException(id+" is not found."));

    }

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }
}
