package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.StockAdjustment;
import com.probestack.forgestudio.design.model.StockAdjustmentInput;
import com.probestack.forgestudio.design.model.StockLevel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import jakarta.validation.constraints.*;
import java.util.List;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.InventoryService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")
@Controller
@RequestMapping("${openapi.inventoryAndOrderManagement.base-path:/v1}")
public class InventoryApiController implements InventoryApi {

    private static final Logger log = LoggerFactory.getLogger(InventoryApiController.class);

    private final InventoryService inventoryService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public InventoryApiController(InventoryService inventoryService, GeneratedRequestValidator generatedRequestValidator) {
        this.inventoryService = inventoryService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<StockAdjustment> adjustInventory(@RequestBody() StockAdjustmentInput stockAdjustmentInput) {
        log.info("Processing adjustInventory request");
        try {
            generatedRequestValidator.validate("adjustInventory", stockAdjustmentInput);
            var response = inventoryService.adjustInventory(stockAdjustmentInput);
            log.info("adjustInventory completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process adjustInventory: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<StockLevel>> listInventory(@RequestParam(value = "warehouseId", required = false) Integer warehouseId, @RequestParam(value = "productId", required = false) Integer productId) {
        log.info("Processing listInventory request");
        try {
            var response = inventoryService.listInventory(warehouseId, productId);
            log.info("listInventory completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listInventory: {}", e.getMessage(), e);
            throw e;
        }
    }
}
