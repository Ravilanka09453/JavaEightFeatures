package com.JavaEightFeatures.controller;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsUsefulMethods {

	List<String> s = Arrays.asList("java", "aws", "docker");
	Employee e1 = new Employee(123, "ravi", s);
	Employee e2 = new Employee(456, "phani", s);
	List<Employee> emplist = Arrays.asList(e1, e2);

	public void some() {

		List<String> q=emplist.stream().flatMap((s) -> s.getEmpSkill().stream()).collect(Collectors.toList());
		
	}

}



