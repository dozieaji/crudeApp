package zoracom.ticket.ticket.project;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;


@Service
public class TicketService {
	
	private List<Ticket> list = new ArrayList<>();
	
	public TicketService() {
		list.add(new Ticket (001, "Transmission Issue", "02-10-2018", "Huawie")); 
		list.add(new Ticket (002, "Rf Issue", "04-11-2017", "Zte")); 
		list.add(new Ticket (003, "Trunk Issue", "07-10-2019", "Ericson")); 
		list.add(new Ticket (004, "Fiber Issue", "08-07-2017", "MainOne")); 
	}
	
		//Return All Tickets	
public List<Ticket> getAllTickets() {
	
	return list;
}

//Return a single ticket

public Ticket getTicket(int id) {
	for (Ticket t: list) {
		if (t.getTicket_Id() == id) {
			return t;
		}
	}
	return null;
}

//Save the ticket

public void saveTicket(Ticket ticket_Id) {
	this.list.add(ticket_Id);
}

public void updateTicket(Ticket ticket_Id) {
	for (Ticket t : list) {
		if( t.getTicket_Id() == ticket_Id.getTicket_Id()) {
			t.setTicket_Name(ticket_Id.getTicket_Name());
		}
	}
}
	
//Remove the Ticket

public void deleteTicket(int ticket_Id) {
	list.remove(ticket_Id);
	
}
}

  
	
