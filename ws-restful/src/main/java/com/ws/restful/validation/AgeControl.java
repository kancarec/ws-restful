package com.ws.restful.validation;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Retention(RUNTIME)
@Target({ TYPE, FIELD, METHOD })
@Constraint(validatedBy = { AgeControlValidationImpl.class })
public @interface AgeControl {


	String message() default "Age must be between 7 and 100";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

}
