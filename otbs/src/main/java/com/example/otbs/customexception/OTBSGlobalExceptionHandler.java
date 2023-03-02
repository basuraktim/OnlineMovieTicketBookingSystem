package com.example.otbs.customexception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class OTBSGlobalExceptionHandler {
	@ExceptionHandler(value = MoviesNotFound.class)
	   public ResponseEntity<Object> exception(MoviesNotFound exception) {
	      return new ResponseEntity<>("Currently there are no movies showing in this city", HttpStatus.NOT_FOUND);
	   }

}
