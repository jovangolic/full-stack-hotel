package com.jovan.back_v2.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StripeClientSecretResponse {
	private String clientSecret;
}
