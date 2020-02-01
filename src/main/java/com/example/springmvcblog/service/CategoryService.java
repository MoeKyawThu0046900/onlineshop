package com.example.springmvcblog.service;

import com.example.springmvcblog.domain.Category;

import java.util.List;

public interface CategoryService {
    Category create(Category category);
    Category findbyID(int id);
    List<Category> findAll();
}
