package com.jovan.back_v2.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StripeResponse {

	private String clientSecret;
	private String error;
	
	public StripeResponse(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    public StripeResponse(String error, boolean isError) {
        this.error = error;
    }
}
