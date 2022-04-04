package com.demo.product_catalog_service.controller;

import com.demo.product_catalog_service.api.CategoryApi;
import com.demo.product_catalog_service.model.Category;
import com.demo.product_catalog_service.model.CategoryCreate;
import com.demo.product_catalog_service.model.CategoryUpdate;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2022-04-01T14:42:25.852+07:00")

@Controller
public class CategoryApiController implements CategoryApi {

    private static final Logger log = LoggerFactory.getLogger(CategoryApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CategoryApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Category> createCategory(@ApiParam(value = "The Category to be created" ,required=true )  @Valid @RequestBody CategoryCreate category) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Category>(objectMapper.readValue("{  \"subCategory\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  } ],  \"isRoot\" : true,  \"lifecycleStatus\" : \"lifecycleStatus\",  \"productOffering\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  } ],  \"validFor\" : {    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"  },  \"@type\" : \"@type\",  \"description\" : \"description\",  \"version\" : \"version\",  \"parentId\" : \"parentId\",  \"@baseType\" : \"@baseType\",  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",  \"name\" : \"name\",  \"id\" : \"id\",  \"href\" : \"href\",  \"@schemaLocation\" : \"http://example.com/aeiou\"}", Category.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Category>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Category>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteCategory(@ApiParam(value = "Identifier of the Category",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Category>> listCategory(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Category>>(objectMapper.readValue("[ {  \"subCategory\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  } ],  \"isRoot\" : true,  \"lifecycleStatus\" : \"lifecycleStatus\",  \"productOffering\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  } ],  \"validFor\" : {    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"  },  \"@type\" : \"@type\",  \"description\" : \"description\",  \"version\" : \"version\",  \"parentId\" : \"parentId\",  \"@baseType\" : \"@baseType\",  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",  \"name\" : \"name\",  \"id\" : \"id\",  \"href\" : \"href\",  \"@schemaLocation\" : \"http://example.com/aeiou\"}, {  \"subCategory\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  } ],  \"isRoot\" : true,  \"lifecycleStatus\" : \"lifecycleStatus\",  \"productOffering\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  } ],  \"validFor\" : {    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"  },  \"@type\" : \"@type\",  \"description\" : \"description\",  \"version\" : \"version\",  \"parentId\" : \"parentId\",  \"@baseType\" : \"@baseType\",  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",  \"name\" : \"name\",  \"id\" : \"id\",  \"href\" : \"href\",  \"@schemaLocation\" : \"http://example.com/aeiou\"} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Category>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Category>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Category> patchCategory(@ApiParam(value = "Identifier of the Category",required=true) @PathVariable("id") String id,@ApiParam(value = "The Category to be updated" ,required=true )  @Valid @RequestBody CategoryUpdate category) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Category>(objectMapper.readValue("{  \"subCategory\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  } ],  \"isRoot\" : true,  \"lifecycleStatus\" : \"lifecycleStatus\",  \"productOffering\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  } ],  \"validFor\" : {    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"  },  \"@type\" : \"@type\",  \"description\" : \"description\",  \"version\" : \"version\",  \"parentId\" : \"parentId\",  \"@baseType\" : \"@baseType\",  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",  \"name\" : \"name\",  \"id\" : \"id\",  \"href\" : \"href\",  \"@schemaLocation\" : \"http://example.com/aeiou\"}", Category.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Category>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Category>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Category> retrieveCategory(@ApiParam(value = "Identifier of the Category",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Category>(objectMapper.readValue("{  \"subCategory\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\",    \"version\" : \"version\"  } ],  \"isRoot\" : true,  \"lifecycleStatus\" : \"lifecycleStatus\",  \"productOffering\" : [ {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  }, {    \"@referredType\" : \"@referredType\",    \"@baseType\" : \"@baseType\",    \"@type\" : \"@type\",    \"name\" : \"name\",    \"id\" : \"id\",    \"href\" : \"http://example.com/aeiou\",    \"@schemaLocation\" : \"http://example.com/aeiou\"  } ],  \"validFor\" : {    \"startDateTime\" : \"1985-04-12T23:20:50.52Z\",    \"endDateTime\" : \"1985-04-12T23:20:50.52Z\"  },  \"@type\" : \"@type\",  \"description\" : \"description\",  \"version\" : \"version\",  \"parentId\" : \"parentId\",  \"@baseType\" : \"@baseType\",  \"lastUpdate\" : \"2000-01-23T04:56:07.000+00:00\",  \"name\" : \"name\",  \"id\" : \"id\",  \"href\" : \"href\",  \"@schemaLocation\" : \"http://example.com/aeiou\"}", Category.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Category>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Category>(HttpStatus.NOT_IMPLEMENTED);
    }

}
