package com.profile.storeproduct.service;

import com.profile.storeproduct.model.dto.ProductDTO;

import java.util.List;

public interface ProductService {
    ProductDTO create(final ProductDTO product);

    ProductDTO disable(final String reference);

    ProductDTO modify(final ProductDTO product);

    List<ProductDTO> obtainAll();
}
