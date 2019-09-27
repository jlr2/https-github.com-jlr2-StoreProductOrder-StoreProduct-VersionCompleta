package com.profile.storeproduct.controller;

import com.profile.storeproduct.controller.constant.EndPointUris;
import com.profile.storeproduct.model.dto.ProductDTO;
import com.profile.storeproduct.model.dto.StockDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping(EndPointUris.PRODUCTS)
public interface ProductApi {
    @PostMapping
    ResponseEntity<ProductDTO> create(@Valid @RequestBody final ProductDTO productDTO);

    @PutMapping(EndPointUris.ID)
    ResponseEntity<ProductDTO> disable(@PathVariable(value = "id") final String reference);

    @PutMapping
    ResponseEntity<ProductDTO> modify(@Valid @RequestBody final ProductDTO productDTO);

    @GetMapping
    ResponseEntity<List<ProductDTO>> findAll();
}
