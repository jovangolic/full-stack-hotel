package com.jovan.back_v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jovan.back_v2.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
