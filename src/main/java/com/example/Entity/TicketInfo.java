package com.example.Entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Ticket_Info")
public class TicketInfo {
      @Id
      @GeneratedValue
      private Long id;
      private String name;
      private String email;
      private String movieName;
      @JsonFormat(shape=JsonFormat.Shape.STRING,pattern="DD-MM-YYYY")
      private Date movieDate;
      private String movieTime;
      private double ticketPrize;
}
