package com.codegnan.hms.hmsapp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class CustomExceptionHandler {
	
	public ResponseEntity<ErrorResponse> methd1(InvalidDoctorIdException e)
	{
		ErrorResponse errorResponse=new ErrorResponse(HttpStatus.NOT_FOUND,e.getMessage());
		ResponseEntity<ErrorResponse>responseEntity=new ResponseEntity<ErrorResponse>(errorResponse,HttpStatus.NOT_FOUND);
		return responseEntity;
	}
	
	//Create Exception handlers for following exceptions
	//InvalidPatientIdException
	//InvalidVisitIdException
	//InvalidDateFormatException
	//Exception
}
