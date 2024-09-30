package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.TicketInfo;
public interface TicketRepository extends JpaRepository<TicketInfo,Integer> {

}
