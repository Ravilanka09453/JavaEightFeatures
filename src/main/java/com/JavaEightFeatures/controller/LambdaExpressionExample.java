package com.JavaEightFeatures.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * About Lambda 1.Lambda-are also referred as anonymous function/method 2.lambda
 * can also be assigned to variable and passed around
 * 
 * Usage of Lambda 1.Mainly used to implement functional interfaces(Single
 * abstract method) ex:Comparator and Runnable (functional interfaces before
 * java 1.8)
 *
 */

@RestController
public class LambdaExpressionExample {

	/**
	 * Prior to Java 8(below:used Anonymous inner class)
	 * 
	 * @return
	 */

	@RequestMapping("/withoutlambda")
	public String withOutLambda() {

		Student student = new Student() {
			@Override
			public String studentInfo() {

				return "Hi this is not java8";
			}

		};

		return student.studentInfo();
	}

	/**
	 * Java 8 using lambda
	 * 
	 * @return
	 */
	@RequestMapping("/withlambda")
	public String withLambda() {

		Student student = () -> "Hi this is Java8";
		return student.studentInfo();
	}

}
