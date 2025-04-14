package com.jovan.back_v2.exceptions;


public class PaymentErrorException extends RuntimeException {

	public PaymentErrorException(String message) {
		super(message);
	}
}
