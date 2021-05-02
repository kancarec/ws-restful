package com.ws.restful.exception;

import javax.validation.ConstraintViolationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
	@Autowired
	private ExceptionConfig excConf;

	@ExceptionHandler(IllegalArgumentException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ExceptionObject handleError(final IllegalArgumentException exp) {
		return this.excConf.createBaseException().setDesc("Exception : " + exp.getMessage()).setCause(100);
	}

	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ExceptionObject handleError(final MethodArgumentNotValidException exp) {
		return this.excConf.createBaseException().setDesc("Exception : " + exp.getMessage()).setCause(101);
	}

	@ExceptionHandler(ConstraintViolationException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ExceptionObject handleError(final ConstraintViolationException exp) {
		return this.excConf.createBaseException().setDesc("Exception : " + exp.getMessage()).setCause(102);
	}

	@ExceptionHandler(Exception.class)
	public ResponseEntity<ExceptionObject> handleError(final Exception exp) {
		return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
				.body(this.excConf.createBaseException().setDesc("Exception : " + exp.getMessage()).setCause(103));
	}
}
