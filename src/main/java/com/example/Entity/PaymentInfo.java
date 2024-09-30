package com.example.Entity;


import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Payment_Info")
public class PaymentInfo {
     @Id
     @GeneratedValue(generator="uuid2") 
     private Long paymentId;
     private String accountNo;
     private double amount;
     private String cardName;
     private Long  ticketId;
}
