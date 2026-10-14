package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.Warehouse;
import com.probestack.forgestudio.design.model.WarehouseInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import java.util.List;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.WarehousesService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")
@Controller
@RequestMapping("${openapi.inventoryAndOrderManagement.base-path:/v1}")
public class WarehousesApiController implements WarehousesApi {

    private static final Logger log = LoggerFactory.getLogger(WarehousesApiController.class);

    private final WarehousesService warehousesService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public WarehousesApiController(WarehousesService warehousesService, GeneratedRequestValidator generatedRequestValidator) {
        this.warehousesService = warehousesService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Warehouse> createWarehouse(@RequestBody() WarehouseInput warehouseInput) {
        log.info("Processing createWarehouse request");
        try {
            generatedRequestValidator.validate("createWarehouse", warehouseInput);
            var response = warehousesService.createWarehouse(warehouseInput);
            log.info("createWarehouse completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createWarehouse: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Warehouse> getWarehouse(@PathVariable() Integer warehouseId) {
        log.info("Processing getWarehouse request");
        try {
            var response = warehousesService.getWarehouse(warehouseId);
            log.info("getWarehouse completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getWarehouse: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<Warehouse>> listWarehouses() {
        log.info("Processing listWarehouses request");
        try {
            var response = warehousesService.listWarehouses();
            log.info("listWarehouses completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listWarehouses: {}", e.getMessage(), e);
            throw e;
        }
    }
}
