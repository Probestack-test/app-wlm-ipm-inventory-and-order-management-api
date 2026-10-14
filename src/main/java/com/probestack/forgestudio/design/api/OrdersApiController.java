package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.Order;
import com.probestack.forgestudio.design.model.OrderInput;
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
import com.probestack.forgestudio.design.service.OrdersService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")
@Controller
@RequestMapping("${openapi.inventoryAndOrderManagement.base-path:/v1}")
public class OrdersApiController implements OrdersApi {

    private static final Logger log = LoggerFactory.getLogger(OrdersApiController.class);

    private final OrdersService ordersService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public OrdersApiController(OrdersService ordersService, GeneratedRequestValidator generatedRequestValidator) {
        this.ordersService = ordersService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<Order> cancelOrder(@PathVariable() Integer orderId) {
        log.info("Processing cancelOrder request");
        try {
            var response = ordersService.cancelOrder(orderId);
            log.info("cancelOrder completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process cancelOrder: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Order> createOrder(@RequestBody() OrderInput orderInput) {
        log.info("Processing createOrder request");
        try {
            generatedRequestValidator.validate("createOrder", orderInput);
            var response = ordersService.createOrder(orderInput);
            log.info("createOrder completed successfully");
            return ResponseEntity.status(HttpStatus.CREATED).body(response.getBody());
        } catch (Exception e) {
            log.error("Failed to process createOrder: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<Order> getOrder(@PathVariable() Integer orderId) {
        log.info("Processing getOrder request");
        try {
            var response = ordersService.getOrder(orderId);
            log.info("getOrder completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process getOrder: {}", e.getMessage(), e);
            throw e;
        }
    }

    @Override()
    public ResponseEntity<List<Order>> listOrders(@RequestParam(value = "status", required = false) String status) {
        log.info("Processing listOrders request");
        try {
            var response = ordersService.listOrders(status);
            log.info("listOrders completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process listOrders: {}", e.getMessage(), e);
            throw e;
        }
    }
}
