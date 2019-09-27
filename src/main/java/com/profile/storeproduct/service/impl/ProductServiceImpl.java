package com.profile.storeproduct.service.impl;

import com.profile.storeproduct.model.ProductVO;
import com.profile.storeproduct.model.dto.ProductDTO;
import com.profile.storeproduct.repository.ProductRepository;
import com.profile.storeproduct.service.ProductService;
import com.profile.storeproduct.service.converter.ProductConverter;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductConverter productConverter;

    @Override
    public ProductDTO create(final ProductDTO product) {
        product.setReference(RandomStringUtils.randomAlphabetic(10));
        return productConverter.convertToDTO(productRepository.save(productConverter.convertToVO(product)));
    }

    @Override
    public List<ProductDTO> obtainAll() {
        return productConverter.convertVOListToDTOList(productRepository.findAll());
    }

    @Override
    @Transactional
    public ProductDTO disable(final String reference) {
        return productConverter.convertToDTO(productRepository.disable(reference));
    }

    @Override
    @Transactional
    public ProductDTO modify(final ProductDTO product) {
        ProductVO productVo = productConverter.convertToVO(product);
        return productConverter.convertToDTO(productRepository.save(productVo));
    }
}
