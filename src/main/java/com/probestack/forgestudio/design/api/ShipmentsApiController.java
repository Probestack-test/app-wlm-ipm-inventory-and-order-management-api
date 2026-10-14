package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.Shipment;
import com.probestack.forgestudio.design.model.ShipmentInput;
import com.probestack.forgestudio.design.model.ShipmentStatusInput;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.ShipmentsService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")
@Controller
@RequestMapping("${openapi.inventoryAndOrderManagement.base-path:/v1}")
public class ShipmentsApiController implements ShipmentsApi {

    private static final Logger log = LoggerFactory.getLogger(ShipmentsApiController.class);

    private final ShipmentsService shipmentsService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public ShipmentsApiController(ShipmentsService shipmentsService, GeneratedRequestValidator generatedRequestValidator) {
        this.shipmentsService = shipmentsService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Shipment> createShipment(@RequestBody() ShipmentInput shipmentInput) {
        log.info("Processing createShipment request");
        try {
            generatedRequestValidator.validate("createShipment", shipmentInput);
            var response = shipmentsService.createShipment(shipmentInput);
            log.info("createShipment completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createShipment: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Shipment> getShipment(@PathVariable() Integer shipmentId) {
        log.info("Processing getShipment request");
        try {
            var response = shipmentsService.getShipment(shipmentId);
            log.info("getShipment completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getShipment: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Shipment> updateShipment(@PathVariable() Integer shipmentId, @RequestBody() ShipmentStatusInput shipmentStatusInput) {
        log.info("Processing updateShipment request");
        try {
            generatedRequestValidator.validate("updateShipment", shipmentStatusInput);
            var response = shipmentsService.updateShipment(shipmentId, shipmentStatusInput);
            log.info("updateShipment completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process updateShipment: {}", e.getMessage(), e);
            throw e;
        }
    }
}
