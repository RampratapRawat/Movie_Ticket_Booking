package com.example.Service;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Entity.PaymentInfo;
import com.example.Entity.TicketInfo;
import com.example.EntityDTO.MovieTicketAcknowledgement;
import com.example.EntityDTO.MovieTicketRequest;
import com.example.Repository.PaymentRepository;
import com.example.Repository.TicketRepository;
import com.example.Utility.ValidPaymentInfo;

import jakarta.transaction.Transactional;

@Service
public class MovieTicketService {
	   @Autowired
       private PaymentRepository paymentRepository;
       @Autowired
       private TicketRepository ticketRepository;
	
       public MovieTicketService(PaymentRepository paymentRepository, TicketRepository ticketRepository) {
		super();
		this.paymentRepository = paymentRepository;
		this.ticketRepository = ticketRepository;
	   }
       @Transactional
       public MovieTicketAcknowledgement bookMovieTicket(MovieTicketRequest request) throws Exception {
    	   TicketInfo ticketInfo =request.getTicketInfo();
    	   ticketInfo =ticketRepository.save(ticketInfo);
    	   
    	   PaymentInfo paymentInfo = request.getPaymentInfo();
    	   ValidPaymentInfo.validateCreditinfo(paymentInfo.getAccountNo(),ticketInfo.getTicketPrize());
    	   
    	   paymentInfo.setTicketId(ticketInfo.getId());
    	   paymentInfo.setAmount(ticketInfo.getTicketPrize());
    	   
    	   paymentRepository.save(paymentInfo);
    	   
    	  
		return  new MovieTicketAcknowledgement("SUCCESS",ticketInfo.getTicketPrize(),UUID.randomUUID().toString().split("-")[0],ticketInfo);
    	   
       }
}
