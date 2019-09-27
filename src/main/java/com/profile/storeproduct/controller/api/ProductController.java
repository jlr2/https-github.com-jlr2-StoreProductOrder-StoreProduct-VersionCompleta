package com.profile.storeproduct.controller.api;


import com.profile.storeproduct.controller.ProductApi;
import com.profile.storeproduct.model.dto.ProductDTO;
import com.profile.storeproduct.model.dto.StockDTO;
import com.profile.storeproduct.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class ProductController implements ProductApi {
    @Autowired
    private ProductService productService;

    @Override
    public ResponseEntity<ProductDTO> create(final ProductDTO productDTO) {
        return ResponseEntity.ok(productService.create(productDTO));
    }

    @Override
    public ResponseEntity<ProductDTO> disable(final String reference) {
        return ResponseEntity.ok(productService.disable(reference));
    }

    @Override
    public ResponseEntity<ProductDTO> modify(@Valid final ProductDTO productDTO) {
        return ResponseEntity.ok(productService.modify(productDTO));
    }

    @Override
    public ResponseEntity<List<ProductDTO>> findAll() {
        return ResponseEntity.ok(productService.obtainAll());
    }

}
