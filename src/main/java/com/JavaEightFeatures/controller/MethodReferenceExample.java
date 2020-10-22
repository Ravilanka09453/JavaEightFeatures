package com.JavaEightFeatures.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * 1.Short cut for writing lambda expression
 * 
 * Where Method reference is used 1.Lambda expression referring to a method
 * directly
 * 
 * 
 *
 */
@RestController
public class MethodReferenceExample {

	// Consumer<Integer> cons=System.out::println;

	// Consumer<Integer> cons1=MethodReferenceExample::som1(t);

	public void som1(Integer t) {
		System.out.println(t + 1);
	}

	@RequestMapping("/methodref")
	public void some() {
		// cons1.accept(2);
	}
}
