/*
 * Copyright 2015-2025 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * https://www.eclipse.org/legal/epl-v20.html
 */


 package com.example.project;

 public class FizzBuzz {
	public String convert(int number) {
		if (number < 1) {
			throw new IllegalArgumentException("Number must be >= 1");
		}
	
		StringBuilder result = new StringBuilder();
		if (number % 3 == 0) {
			result.append("Fizz");
		}
		if (number % 5 == 0) {
			result.append("Buzz");
		}
	
		return result.length() > 0 ? result.toString() : String.valueOf(number);
	}
	
 }
	
 