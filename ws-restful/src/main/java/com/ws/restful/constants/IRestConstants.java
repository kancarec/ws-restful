package com.ws.restful.constants;

import java.util.Map;

public interface IRestConstants {

	Map<Long, String> STUDENT_NAME_MAP = Map.of(1l, "Ali", 2l, "Veli");
	Map<Long, String> STUDENT_CITY_MAP = Map.of(1l, "Rio", 2l, "Rome");
	Map<String, Integer> STUDENT_AGE_MAP = Map.of("1", 17, "2", 16);
	Map<String, String> STUDENT_LESSON_MAP = Map.of("1", "History", "2", "Maths");
	Map<String, String> STUDENT_COUNTRY_MAP = Map.of("1", "Turkey", "2", "France");
	String EMPTY_STR = "";

}
