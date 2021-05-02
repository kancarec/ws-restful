package com.ws.restful.exception;

import java.util.ArrayList;
import java.util.List;

public class ExceptionObject {
	private List<ExceptionObject> subExceptions;
	private String desc;
	private Integer cause;

	public List<ExceptionObject> getSubExceptions() {
		return subExceptions;
	}

	public ExceptionObject setSubExceptions(List<ExceptionObject> subExceptions) {
		this.subExceptions = subExceptions;
		return this;
	}
	public String getDesc() {
		return desc;
	}

	public ExceptionObject setDesc(String desc) {
		this.desc = desc;
		return this;
	}

	public Integer getCause() {
		return cause;
	}

	public ExceptionObject setCause(Integer cause) {
		this.cause = cause;
		return this;
	}

	public ExceptionObject addSubErrorObject(final ExceptionObject exc) {
		if (this.subExceptions == null) {
			this.subExceptions = new ArrayList<>();
		}
		this.subExceptions.add(exc);
		return this;
	}

}
