package com.br.burguer.services.category;

import com.br.burguer.record.category.CategoryDTO;
import com.br.burguer.record.category.CategoryNewDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {

    Page<CategoryDTO> getAllCategories(Pageable pageable);

    CategoryDTO getCategoryById(Long categoryId);

    CategoryNewDTO createCategory(CategoryNewDTO categoryDTO);

    void deleteCategoryById(Long id);
}
