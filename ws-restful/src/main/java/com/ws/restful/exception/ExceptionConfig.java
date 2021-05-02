package com.ws.restful.exception;

import org.springframework.stereotype.Component;

@Component
public class ExceptionConfig {
	public ExceptionObject createBaseException() {
		return new ExceptionObject();
	}
}
