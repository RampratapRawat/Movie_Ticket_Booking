package com.example.EntityDTO;



import com.example.Entity.PaymentInfo;
import com.example.Entity.TicketInfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieTicketRequest {
      private TicketInfo ticketInfo;
      private PaymentInfo paymentInfo;
      
      
}
