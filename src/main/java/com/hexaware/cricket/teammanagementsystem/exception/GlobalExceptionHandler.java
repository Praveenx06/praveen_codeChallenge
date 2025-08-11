package com.hexaware.cricket.teammanagementsystem.exception;

import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

public class GlobalExceptionHandler {


	@ExceptionHandler(PlayerNotFoundException.class)
	@ResponseStatus(reason = "zero divide exception occur" , code = HttpStatus.BAD_REQUEST)
	public void  handler() {
		
	}
}