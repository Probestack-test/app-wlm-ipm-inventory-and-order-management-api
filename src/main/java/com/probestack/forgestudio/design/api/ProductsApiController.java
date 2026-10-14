package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.Product;
import com.probestack.forgestudio.design.model.ProductInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import java.util.List;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ProductsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")
@Controller
@RequestMapping("${openapi.inventoryAndOrderManagement.base-path:/v1}")
public class ProductsApiController implements ProductsApi {

    private static final Logger log = LoggerFactory.getLogger(ProductsApiController.class);

    private final ProductsService productsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ProductsApiController(ProductsService productsService, GeneratedRequestValidator generatedRequestValidator) {
        this.productsService = productsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Product> createProduct(@RequestBody() ProductInput productInput) {
        log.info("Processing createProduct request");
        try {
            generatedRequestValidator.validate("createProduct", productInput);
            var response = productsService.createProduct(productInput);
            log.info("createProduct completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createProduct: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Void> deleteProduct(@PathVariable() Integer productId) {
        log.info("Processing deleteProduct request");
        try {
            var response = productsService.deleteProduct(productId);
            log.info("deleteProduct completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process deleteProduct: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Product> getProduct(@PathVariable() Integer productId) {
        log.info("Processing getProduct request");
        try {
            var response = productsService.getProduct(productId);
            log.info("getProduct completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getProduct: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<Product>> listProducts(@RequestParam(value = "search", required = false) String search, @RequestParam(value = "category", required = false) String category, @RequestParam(value = "limit", required = false) Integer limit) {
        log.info("Processing listProducts request");
        try {
            var response = productsService.listProducts(search, category, limit);
            log.info("listProducts completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listProducts: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Product> updateProduct(@PathVariable() Integer productId, @RequestBody() ProductInput productInput) {
        log.info("Processing updateProduct request");
        try {
            generatedRequestValidator.validate("updateProduct", productInput);
            var response = productsService.updateProduct(productId, productInput);
            log.info("updateProduct completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process updateProduct: {}", e.getMessage(), e);
            throw e;
        }
    }
}
