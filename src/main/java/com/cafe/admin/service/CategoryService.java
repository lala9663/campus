package com.cafe.admin.service;

import com.cafe.admin.dto.CategoryDTO;
import com.cafe.admin.repository.CategoryRepository;
import com.cafe.admin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository repo;
    @Autowired
    ProductRepository pr;

    public List<CategoryDTO> selectAllCategory() {
        return repo.selectAllCategory();
    }

    @Transactional
    public String deleteCategories(CategoryDTO categoryDTO) {
        int result = 0;
        result += repo.deleteCatemaps(categoryDTO);
        result += repo.deleteCategories(categoryDTO);
        if (result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    public String insertCategories(CategoryDTO categoryDTO) {
        int result = 0;
        result = repo.insertCategories(categoryDTO);
        if (result == 1) {
            return "success";
        } else {
            return "failed";
        }
    }

    public String updateCategories(CategoryDTO categoryDTO) {
        int result = 0;
        result = repo.updateCategories(categoryDTO);
        if (result == 1) {
            return "success";
        } else {
            return "failed";
        }

    }
}
