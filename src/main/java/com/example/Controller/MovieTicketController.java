package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import com.example.EntityDTO.MovieTicketAcknowledgement;
import com.example.EntityDTO.MovieTicketRequest;
import com.example.Service.MovieTicketService;

@RestController
public class MovieTicketController {
    @Autowired   
	private MovieTicketService movieTicketService;

	public MovieTicketController(MovieTicketService movieTicketService) {
		super();
		this.movieTicketService = movieTicketService;
	}
    
    @PostMapping("/bookMovieTicket")
    public MovieTicketAcknowledgement bookTicket(@RequestBody MovieTicketRequest request) throws Exception {
    	return movieTicketService.bookMovieTicket(request);
    }
}
