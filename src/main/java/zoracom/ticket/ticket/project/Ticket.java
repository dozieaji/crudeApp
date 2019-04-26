package zoracom.ticket.ticket.project;

public class Ticket {
	
	int ticket_Id;
	String ticket_Name;
	String date_Created;
	String ticket_Category;
	
	
	public Ticket(int ticket_Id, String ticket_Name, String date_Created, String ticket_Category) {
		super();
		this.ticket_Id = ticket_Id;
		this.ticket_Name = ticket_Name;
		this.date_Created = date_Created;
		this.ticket_Category = ticket_Category;
	}


	
	public int getTicket_Id() {
		return ticket_Id;
	}
	

	public void setTicket_Id(int ticket_Id) {
		this.ticket_Id = ticket_Id;
	}
	
	public String getTicket_Name() {
		return ticket_Name;
	}
	
	public void setTicket_Name(String ticket_Name) {
		this.ticket_Name = ticket_Name;
	}
	
	public String getDate_Created() {
		return date_Created;
	}
	
	public void setDate_Created(String date_Created) {
		this.date_Created = date_Created;
	}
	
	public String getTicket_Category() {
		return ticket_Category;
	}
	
	public void setTicket_Category(String ticket_Category) {
		this.ticket_Category = ticket_Category;
	}

	
	
	
}
