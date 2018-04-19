package alka.publishing.house.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.sap.icd.bs.bcm.generated.api.RequestMoneyApi;
import com.sap.icd.bs.bcm.generated.dto.MoneyRequestDto;

import alka.publishing.house.service.RequestMoneyService;
import io.swagger.annotations.ApiParam;

public class RequestMoneyController implements RequestMoneyApi {
	
	RequestMoneyService service;

	@Override
	public ResponseEntity<Void> deletePhoneNumber(
			@ApiParam(value = "Phone number for which row to be deleted", required = true) @PathVariable("phonenumber") String phonenumber) {
		service.deletePhoneNumber(phonenumber);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Void> requestMoney(
			@ApiParam(value = "Deatils of Phone number and money credit", required = true) @RequestBody MoneyRequestDto body) {
		service.transferMoney(body);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
