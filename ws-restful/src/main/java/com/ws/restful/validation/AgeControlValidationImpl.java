package com.ws.restful.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeControlValidationImpl implements ConstraintValidator<AgeControl, Integer> {

	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) {
		return 7 < value && value < 100;

	}

}
