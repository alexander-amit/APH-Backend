package alka.publishing.house.controller;

import javax.validation.constraints.NotNull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sap.icd.bs.bcm.generated.api.UploadApi;
import com.sap.icd.bs.bcm.generated.dto.QuestionDto;
import com.sap.icd.bs.bcm.generated.dto.QuestionList;

import alka.publishing.house.service.UploadService;
import io.swagger.annotations.ApiParam;

@RestController
public class UploadController implements UploadApi {
	
	@Autowired
	UploadService service;
	
	@Override
	public ResponseEntity<QuestionList> getFiveQuestionList(
			@NotNull @ApiParam(value = "tags to filter by", required = true) @RequestParam(value = "stream", required = true) String stream,
			@NotNull @ApiParam(value = "tags to filter by", required = true) @RequestParam(value = "year", required = true) String year,
			@NotNull @ApiParam(value = "tags to filter by", required = true) @RequestParam(value = "subject", required = true) String subject) {
		
		return new ResponseEntity<QuestionList>(service.getFiveQues(stream,year,subject),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<QuestionDto> getQuestion(
			@ApiParam(value = "name of stream", required = true) @PathVariable("stream") String stream,
			@ApiParam(value = "year number", required = true) @PathVariable("year") String year,
			@ApiParam(value = "name of subject", required = true) @PathVariable("subject") String subject,
			@ApiParam(value = "Id of subject", required = true) @PathVariable("id") String id) {
		// do some magic!
		return new ResponseEntity<QuestionDto>(service.getQuestion(stream,year,subject,id),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<QuestionDto> updateQuestion(
			@ApiParam(value = "Question and Ans Multiple choice", required = true) @RequestBody QuestionDto body) {
		
		return new ResponseEntity<QuestionDto>(service.update(body),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<QuestionDto> uploadQuestion(
			@ApiParam(value = "Question and Ans Multiple choice", required = true) @RequestBody QuestionDto body) {
		
		return new ResponseEntity<QuestionDto>(service.upload(body),HttpStatus.OK);
	}

}
