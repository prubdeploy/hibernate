package com.example.hibernate.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DepartmentExceptionController {
	 @ExceptionHandler(value = DepartmentForeignKeyException.class)
	   public ResponseEntity<Object> exception(DepartmentForeignKeyException exception) {
	      return new ResponseEntity<>("SQL Exception", HttpStatus.BAD_REQUEST);
	   }
}

