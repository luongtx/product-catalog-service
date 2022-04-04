package com.demo.product_catalog_service.controller;


import com.demo.product_catalog_service.api.CatalogApi;
import com.demo.product_catalog_service.model.Catalog;
import com.demo.product_catalog_service.model.CatalogCreate;
import com.demo.product_catalog_service.model.CatalogUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-01T14:42:25.852+07:00")
@RestController
public class CatalogApiController implements CatalogApi {

    private static final Logger log = LoggerFactory.getLogger(CatalogApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

//    @Autowired
//    CatalogRepository catalogRepository;

    @Autowired
    public CatalogApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Catalog> createCatalog(@ApiParam(value = "The Catalog to be created", required = true) @Valid @RequestBody CatalogCreate catalog) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Catalog>(objectMapper.readValue("{  \"catalogType\" : \"catalogType\",  \"lifecycleStatus\" : \"lifecycleStatus\",  \"validFor\" : {    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"  },  \"@type\" : \"@type\",  \"description\" : \"description\",  \"relatedParty\" : [ {    \"@referredType\" : \"@referredType\",    \"role\" : \"role\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  }, {    \"@referredType\" : \"@referredType\",    \"role\" : \"role\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  } ],  \"version\" : \"version\",  \"@baseType\" : \"@baseType\",  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",  \"name\" : \"name\",  \"id\" : \"id\",  \"href\" : \"href\",  \"category\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  } ],  \"@schemaLocation\" : \"http://example.com/aeiou\"}", Catalog.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Catalog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Catalog>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCatalog(@ApiParam(value = "Identifier of the Catalog", required = true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Catalog>> listCatalog(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields, @ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false, defaultValue = "0") Integer offset, @ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
//            Pageable pageable = PageRequest.of(offset, limit);
//            Page<Catalog> pageCatalog = catalogRepository.findAll(pageable);
            List<Catalog> catalogs = new ArrayList<>();
            return new ResponseEntity<>(catalogs, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Catalog> patchCatalog(@ApiParam(value = "Identifier of the Catalog", required = true) @PathVariable("id") String id, @ApiParam(value = "The Catalog to be updated", required = true) @Valid @RequestBody CatalogUpdate catalog) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Catalog>(objectMapper.readValue("{  \"catalogType\" : \"catalogType\",  \"lifecycleStatus\" : \"lifecycleStatus\",  \"validFor\" : {    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"  },  \"@type\" : \"@type\",  \"description\" : \"description\",  \"relatedParty\" : [ {    \"@referredType\" : \"@referredType\",    \"role\" : \"role\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  }, {    \"@referredType\" : \"@referredType\",    \"role\" : \"role\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  } ],  \"version\" : \"version\",  \"@baseType\" : \"@baseType\",  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",  \"name\" : \"name\",  \"id\" : \"id\",  \"href\" : \"href\",  \"category\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  } ],  \"@schemaLocation\" : \"http://example.com/aeiou\"}", Catalog.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Catalog>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Catalog>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Catalog> retrieveCatalog(@ApiParam(value = "Identifier of the Catalog", required = true) @PathVariable("id") String id, @ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
//           Catalog catalog = catalogRepository.findCatalogById(id);
            Catalog catalog = new Catalog();
            return new ResponseEntity<>(catalog, HttpStatus.OK);
        }

        return new ResponseEntity<Catalog>(HttpStatus.NOT_IMPLEMENTED);
    }

}
