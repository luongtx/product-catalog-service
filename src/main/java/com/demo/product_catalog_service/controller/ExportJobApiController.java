package com.demo.product_catalog_service.controller;

import com.demo.product_catalog_service.api.ExportJobApi;
import com.demo.product_catalog_service.model.ExportJob;
import com.demo.product_catalog_service.model.ExportJobCreate;
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
public class ExportJobApiController implements ExportJobApi {

    private static final Logger log = LoggerFactory.getLogger(ExportJobApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ExportJobApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ExportJob> createExportJob(@ApiParam(value = "The ExportJob to be created" ,required=true )  @Valid @RequestBody ExportJobCreate exportJob) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExportJob>(objectMapper.readValue("{  \"@type\" : \"@type\",  \"query\" : \"query\",  \"errorLog\" : \"errorLog\",  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"url\" : \"http://example.com/aeiou\",  \"path\" : \"path\",  \"@baseType\" : \"@baseType\",  \"completionDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : \"id\",  \"href\" : \"http://example.com/aeiou\",  \"@schemaLocation\" : \"http://example.com/aeiou\",  \"contentType\" : \"contentType\",  \"status\" : { }}", ExportJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExportJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExportJob>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteExportJob(@ApiParam(value = "Identifier of the ExportJob",required=true) @PathVariable("id") String id) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<ExportJob>> listExportJob(@ApiParam(value = "Comma-separated properties to be provided in response") @Valid @RequestParam(value = "fields", required = false) String fields,@ApiParam(value = "Requested index for start of resources to be provided in response") @Valid @RequestParam(value = "offset", required = false) Integer offset,@ApiParam(value = "Requested number of resources to be provided in response") @Valid @RequestParam(value = "limit", required = false) Integer limit) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<ExportJob>>(objectMapper.readValue("[ {  \"@type\" : \"@type\",  \"query\" : \"query\",  \"errorLog\" : \"errorLog\",  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"url\" : \"http://example.com/aeiou\",  \"path\" : \"path\",  \"@baseType\" : \"@baseType\",  \"completionDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : \"id\",  \"href\" : \"http://example.com/aeiou\",  \"@schemaLocation\" : \"http://example.com/aeiou\",  \"contentType\" : \"contentType\",  \"status\" : { }}, {  \"@type\" : \"@type\",  \"query\" : \"query\",  \"errorLog\" : \"errorLog\",  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"url\" : \"http://example.com/aeiou\",  \"path\" : \"path\",  \"@baseType\" : \"@baseType\",  \"completionDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : \"id\",  \"href\" : \"http://example.com/aeiou\",  \"@schemaLocation\" : \"http://example.com/aeiou\",  \"contentType\" : \"contentType\",  \"status\" : { }} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<ExportJob>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<ExportJob>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ExportJob> retrieveExportJob(@ApiParam(value = "Identifier of the ExportJob",required=true) @PathVariable("id") String id,@ApiParam(value = "Comma-separated properties to provide in response") @Valid @RequestParam(value = "fields", required = false) String fields) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExportJob>(objectMapper.readValue("{  \"@type\" : \"@type\",  \"query\" : \"query\",  \"errorLog\" : \"errorLog\",  \"creationDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"url\" : \"http://example.com/aeiou\",  \"path\" : \"path\",  \"@baseType\" : \"@baseType\",  \"completionDate\" : \"2000-01-23T04:56:07.000+00:00\",  \"id\" : \"id\",  \"href\" : \"http://example.com/aeiou\",  \"@schemaLocation\" : \"http://example.com/aeiou\",  \"contentType\" : \"contentType\",  \"status\" : { }}", ExportJob.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExportJob>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExportJob>(HttpStatus.NOT_IMPLEMENTED);
    }

}
