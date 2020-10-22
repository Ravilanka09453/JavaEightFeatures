package com.JavaEightFeatures.controller;

import java.util.function.Consumer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 1.You cannot reassign/modify local variable inside lambda even though they
 * are not declared final this concept is called effectively final. 2.if you
 * want to reassign/modify should mention the variable globally.
 * 
 *
 */
@RestController
public class LocalVariablesRestricationsInLambda {

	int num = 4;

	/**
	 * Note:Prior to java 8,any variable thats used inside the anonymous class
	 * should be declared final, Now in java 8 no need to declare explicitly,which
	 * makes easy to perform concurrency operations.
	 */

	@RequestMapping("/effectivelyfinal")
	public void effictivelyFinal() {

		int value = 4;

		Consumer<Integer> c1 = (i) -> {
			// value++; //local variable cannot be reassigned or modify
			System.out.println(value + i);
			// num++; //global variable can be reassigned or modify
			System.out.println(num + i);
		};

		c1.accept(2);
	}

}
