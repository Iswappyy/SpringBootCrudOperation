package com.pro.wings.SpringBootCrudOperation.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(MyCusomeException.class)
	public ResponseEntity<?> handleEmployeeNotFoundException(MyCusomeException ex, WebRequest request) {

		ErrorInfo err = new ErrorInfo(new Date(), ex.getMessage(), request.getDescription(true));

		ResponseEntity<ErrorInfo> re = new ResponseEntity(err, HttpStatus.NOT_FOUND);

		return re;
	}

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<?> handleEmployeeNotFoundException(ResourceNotFoundException re, WebRequest request) {

		ErrorInfo err = new ErrorInfo(new Date(), re.getMessage(), request.getDescription(false));

		ResponseEntity<ErrorInfo> er = new ResponseEntity(err, HttpStatus.BAD_REQUEST);

		return er;

	}

}
