package com.cafe.admin.service;

import com.cafe.admin.dto.ProductDTO;
import com.cafe.admin.dto.SellTimeDTO;
import com.cafe.admin.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    public List<ProductDTO> selectProducts() {
        return repo.selectProducts();
    }

    public ProductDTO selectProduct(String id) {
        return repo.selectProduct(id);
    }

    @Transactional
    public String deleteProducts(ProductDTO productDTO) {
        int result = 0;
        result += repo.deleteCatemaps(productDTO);
        result += repo.deleteProducts(productDTO);

        if (result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @Transactional
    public String updateProducts(ProductDTO productDTO) {
        int result = 0;
        result += repo.deleteCatemaps(productDTO);
        result += repo.insertCatemaps(productDTO);
        result += repo.updateProducts(productDTO);
        if (result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }

    @Transactional
    public String insertProducts(ProductDTO productDTO) {
        int result = 0;
        result += repo.insertProducts(productDTO);
        result += repo.insertCatemaps(productDTO);
        if (result > 0) {
            return "success";
        } else {
            return "failed";
        }
    }


    public String insertSellTimes(SellTimeDTO sellTimeDTO) {
        int result = 0;
        result += repo.insertSellTimes(sellTimeDTO);
        if (result == 1) {
            return "success";
        } else {
            return "failed";
        }
    }

    public String deleteSellTimes(SellTimeDTO sellTimeDTO) {
        int result = 0;
        result += repo.deleteSellTimes(sellTimeDTO);
        if (result == 1) {
            return "success";
        } else {
            return "failed";
        }
    }

    public List<SellTimeDTO> selectSellTimes() {
        return repo.selectSellTimes();

    }

}
