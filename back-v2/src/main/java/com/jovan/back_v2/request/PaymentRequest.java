package com.jovan.back_v2.request;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {

	private Long userId;
	private Double amount;
	private String currency;
}
