package com.jovan.back_v2.exceptions;


public class RoleAlreadyExistException extends RuntimeException {

	public RoleAlreadyExistException(String message) {
        super(message);
    }
}
