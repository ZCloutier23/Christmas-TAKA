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
		if (number % 3 == 0 && number % 5 == 0) {
			return "FizzBuzz";
		}
		if (number % 3 == 0) {
			return "Fizz";
		}
		if (number % 5 == 0) {
			return "Buzz";
		}
		return String.valueOf(number);
	}
 }	
	
 