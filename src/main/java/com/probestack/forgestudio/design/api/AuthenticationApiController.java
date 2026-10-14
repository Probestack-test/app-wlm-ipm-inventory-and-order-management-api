package com.probestack.forgestudio.design.api;

import com.probestack.forgestudio.design.model.AuthToken;
import com.probestack.forgestudio.design.model.LoginRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import jakarta.validation.constraints.*;
import jakarta.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.probestack.forgestudio.design.service.AuthenticationService;
import com.probestack.forgestudio.design.validation.GeneratedRequestValidator;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-10-14T10:19:45.087534910Z[GMT]")
@Controller
@RequestMapping("${openapi.inventoryAndOrderManagement.base-path:/v1}")
public class AuthenticationApiController implements AuthenticationApi {

    private static final Logger log = LoggerFactory.getLogger(AuthenticationApiController.class);

    private final AuthenticationService authenticationService;

    private final GeneratedRequestValidator generatedRequestValidator;

    @Autowired()
    public AuthenticationApiController(AuthenticationService authenticationService, GeneratedRequestValidator generatedRequestValidator) {
        this.authenticationService = authenticationService;
        this.generatedRequestValidator = generatedRequestValidator;
    }

    @Override()
    public ResponseEntity<AuthToken> login(@RequestBody() LoginRequest loginRequest) {
        log.info("Processing login request");
        try {
            generatedRequestValidator.validate("login", loginRequest);
            var response = authenticationService.login(loginRequest);
            log.info("login completed successfully");
            return response;
        } catch (Exception e) {
            log.error("Failed to process login: {}", e.getMessage(), e);
            throw e;
        }
    }
}
