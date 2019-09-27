package com.profile.storeproduct.repository;

import com.profile.storeproduct.model.ProductVO;

public interface CustomProductRepository {
    ProductVO disable(final String reference);
}
