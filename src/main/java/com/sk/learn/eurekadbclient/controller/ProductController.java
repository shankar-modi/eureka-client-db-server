package com.sk.learn.eurekadbclient.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author shankarmodi
 * 07/04/18
 */

@RestController
@RequestMapping("/db/products")
public class ProductController {

    @GetMapping("/{productName}")
    public String getProducts(@PathVariable String productName){

        return "PRODUCT : " + productName;
    }
}


