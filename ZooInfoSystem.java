//Carson Smith
//Homework 3
//CEN4025

public class ZooInfoSystem {
	
	public static void main(String[] args) {
		
		System.out.printf("---Employees---%n");
		
		getEmployees("Carson Smith", "Programmer", "321-555-5555", "carson@email.com", "Mon-Friday");
		
		System.out.printf("---Customers---%n");
		getCustomers("Bob", "321-546-8564", "bob@email.com", 1);
		
		System.out.printf("---Animals---%n");
		getAnimals("Carl", "genes Ateles", "Area 1");
		
		System.out.printf("---Tickets---%n");
		getTickets(1, "regular", 10);
		
		System.out.printf("---Programs---%n");
		getPrograms("Employees", "Contains Employee Details", "Carson", "3/13/2020");
		
	}
	
	public static void getEmployees(String name, String job, String phone, String email, String workSchedule) {
		
		System.out.printf("Name:%s%nJob:%s%nPhone:%s%nEmail:%s%nWork Schedule:%s%n%n", name, job, phone, email, workSchedule);
		
	}
	
	public static void getCustomers(String name, String phone, String email, int ticketNum) {
		
		System.out.printf("Name:%s%nPhone:%s%nEmail:%s%nTicket Number:%s%n%n", name, phone, email, ticketNum);
		
	}
	
	public static void getAnimals(String name, String species, String location) {
		System.out.printf("Name:%s%nSpecies:%s%nLocation:%s%n%n", name, species, location);
	}
	
	public static void getTickets(int ticketNum, String ticketType, int price) {
		
		System.out.printf("Ticket Number:%s%nTicket Type:%s%nPrice:$%s%n%n", ticketNum, ticketType, price);
		
	}
	
	public static void getPrograms(String programName, String function, String teamLeaderName, String maintDate) {
		
		System.out.printf("Program Name:%s%nFunction:%s%nTeam Leader:%s%nLast Maintenanced:%s%n%n", programName, function, teamLeaderName, maintDate);
		
	}
}
