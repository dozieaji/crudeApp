package zoracom.ticket.ticket.project;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {

@Autowired
private TicketService ticketService;
	
	
	//GET
@RequestMapping (value = "/ticket" , method = RequestMethod.GET)
public List <Ticket> getAllTickets(){
	return ticketService.getAllTickets();
}

//GET A SINGLE TICKET


@RequestMapping (value = "/ticket/{id}"   , method = RequestMethod.GET)               
public Ticket   getTicketById(@PathVariable int id) {
	
	return ticketService.getTicket(id);
	
	
}

//POST

@RequestMapping (value = "/ticket/save",method = RequestMethod.POST)
public void saveTicket(@RequestBody Ticket ticket_Id) {
	ticketService.saveTicket(ticket_Id);
}

//PUT
	
@RequestMapping (value = "/ticket/update")
public void updateTicket(@RequestBody Ticket ticket_Id) {
	ticketService.updateTicket(ticket_Id);
}


//DELETE


@DeleteMapping (value = "/delete/{id}")
public String deleteTicket(@PathVariable int id) {
	
	ticketService.deleteTicket(id);
	
	return " This Post was deleted";
}
		
		
}
