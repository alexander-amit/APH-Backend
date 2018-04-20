package com.sap.icd.bs.bcm.generated.api;

import com.sap.icd.bs.bcm.generated.dto.QuestionDto;
import com.sap.icd.bs.bcm.generated.dto.QuestionList;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-04-20T15:10:24.329+05:30")

@Api(value = "upload", description = "the upload API")
public interface UploadApi {

    @ApiOperation(value = "Get question with query", notes = "", response = QuestionList.class, tags={ "Upload", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returned required List of Questions", response = QuestionList.class),
        @ApiResponse(code = 405, message = "Invalid input", response = QuestionList.class) })
    @RequestMapping(value = "/upload",
        method = RequestMethod.GET)
    default ResponseEntity<QuestionList> getFiveQuestionList( @NotNull @ApiParam(value = "tags to filter by", required = true) @RequestParam(value = "stream", required = true) String stream,
         @NotNull @ApiParam(value = "tags to filter by", required = true) @RequestParam(value = "year", required = true) String year,
         @NotNull @ApiParam(value = "tags to filter by", required = true) @RequestParam(value = "subject", required = true) String subject) {
        // do some magic!
        return new ResponseEntity<QuestionList>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get Specific question with Id", notes = "", response = QuestionDto.class, tags={ "Upload", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Returned required Question", response = QuestionDto.class),
        @ApiResponse(code = 405, message = "Invalid input", response = QuestionDto.class) })
    @RequestMapping(value = "/upload/{stream}/{year}/{subject}/{id}",
        method = RequestMethod.GET)
    default ResponseEntity<QuestionDto> getQuestion(@ApiParam(value = "name of stream",required=true ) @PathVariable("stream") String stream,
        @ApiParam(value = "year number",required=true ) @PathVariable("year") String year,
        @ApiParam(value = "name of subject",required=true ) @PathVariable("subject") String subject,
        @ApiParam(value = "Id of subject",required=true ) @PathVariable("id") String id) {
        // do some magic!
        return new ResponseEntity<QuestionDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Update Existing Ques", notes = "", response = QuestionDto.class, tags={ "Upload", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = QuestionDto.class),
        @ApiResponse(code = 405, message = "Invalid input", response = QuestionDto.class) })
    @RequestMapping(value = "/upload",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<QuestionDto> updateQuestion(@ApiParam(value = "Question and Ans Multiple choice" ,required=true ) @RequestBody QuestionDto body) {
        // do some magic!
        return new ResponseEntity<QuestionDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Uplaod new Question", notes = "", response = QuestionDto.class, tags={ "Upload", })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Created", response = QuestionDto.class),
        @ApiResponse(code = 405, message = "Invalid input", response = QuestionDto.class) })
    @RequestMapping(value = "/upload",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<QuestionDto> uploadQuestion(@ApiParam(value = "Question and Ans Multiple choice" ,required=true ) @RequestBody QuestionDto body) {
        // do some magic!
        return new ResponseEntity<QuestionDto>(HttpStatus.OK);
    }

}
