package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.PaymentInfo;

public interface PaymentRepository extends JpaRepository<PaymentInfo,String> {

}
