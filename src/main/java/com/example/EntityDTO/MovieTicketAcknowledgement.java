package com.example.EntityDTO;

import com.example.Entity.TicketInfo;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieTicketAcknowledgement {
      
	private String status;
	private double totalFare;
	private String prnNo;
	private TicketInfo ticketInfo;
	
	
	
	
}
