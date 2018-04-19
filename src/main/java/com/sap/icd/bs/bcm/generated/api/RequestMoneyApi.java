package com.sap.icd.bs.bcm.generated.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sap.icd.bs.bcm.generated.dto.MoneyRequestDto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-19T11:24:25.131+05:30")

@Api(value = "requestMoney", description = "the requestMoney API")
public interface RequestMoneyApi {

    @ApiOperation(value = "Deleting record after credit", notes = "", response = Void.class, tags={ "PaytmMoney", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Deleted", response = Void.class),
        @ApiResponse(code = 400, message = "Invalid Input", response = Void.class) })
    @RequestMapping(value = "/requestMoney",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> deletePhoneNumber(@ApiParam(value = "Phone number for which row to be deleted",required=true ) @PathVariable("phonenumber") String phonenumber) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }


    @ApiOperation(value = "Request for Paytm Money", notes = "", response = Void.class, tags={ "PaytmMoney", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Money will be credited within 2 working days", response = Void.class),
        @ApiResponse(code = 405, message = "Invalid input", response = Void.class) })
    @RequestMapping(value = "/requestMoney",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> requestMoney(@ApiParam(value = "Deatils of Phone number and money credit" ,required=true ) @RequestBody MoneyRequestDto body) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
