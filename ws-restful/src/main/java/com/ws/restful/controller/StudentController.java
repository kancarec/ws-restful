package com.ws.restful.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ws.restful.constants.IRestConstants;

/*
 GetMapping:
 	*ParameterTypes:PathVariable,RequestParam
 PostMapping:
    *ParameterTypes:RequestBody,RequestParam,RequestHeader 
 
 */

@RestController
@RequestMapping("/api/v1/student")
public class StudentController implements IRestConstants {

	@GetMapping("/getCity")
	String getCity(@RequestParam final Long studentNo) {
		return "Student City:"
				+ (STUDENT_CITY_MAP.containsKey(studentNo) ? STUDENT_CITY_MAP.get(studentNo).toString() : EMPTY_STR);

	}

	@GetMapping("/getName/{studentNo}")
	String getName(@PathVariable final Long studentNo) {
		return "Student Name:"
				+ (STUDENT_NAME_MAP.containsKey(studentNo) ? STUDENT_NAME_MAP.get(studentNo).toString() : EMPTY_STR);

	}

	@PostMapping(value = "/getLesson", produces = MediaType.TEXT_PLAIN_VALUE)
	String getLessonList(@RequestBody final String studentNo) {
		return STUDENT_LESSON_MAP.containsKey(studentNo) ? STUDENT_LESSON_MAP.get(studentNo) : EMPTY_STR;
	}

	@PostMapping(value = "/getAge", produces = MediaType.TEXT_PLAIN_VALUE)
	String getAge(@RequestParam final String studentNo) {
		return STUDENT_AGE_MAP.containsKey(studentNo) ? STUDENT_AGE_MAP.get(studentNo).toString() : EMPTY_STR;
	}

	@PostMapping(value = "/getCountry", produces = MediaType.TEXT_PLAIN_VALUE)
	String getCountry(@RequestHeader final String studentNo) {
		return STUDENT_COUNTRY_MAP.containsKey(studentNo) ? STUDENT_COUNTRY_MAP.get(studentNo).toString() : EMPTY_STR;
	}

	@PostMapping(value = "/getCountry/{studentNo}", produces = MediaType.TEXT_PLAIN_VALUE)
	String getCountryByPB(@PathVariable final String studentNo) {
		return STUDENT_COUNTRY_MAP.containsKey(studentNo) ? STUDENT_COUNTRY_MAP.get(studentNo).toString() : EMPTY_STR;
	}

}
