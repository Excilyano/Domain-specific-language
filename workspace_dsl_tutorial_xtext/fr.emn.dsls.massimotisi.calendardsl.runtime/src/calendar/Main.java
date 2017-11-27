package calendar;

public class Main {
	
	public static void main(String[] args) {
		Calendar calendar = new Calendar();
		Event event1 = new Event();
		event1.setName("DSL tutorial");
		event1.setDate(2009, 11, 8);
		event1.setStartTime("09:00");
		event1.setEndTime("16:00");
		event1.setLocation("Aarhus Music Hall");
		calendar.addEvent(event1);
		Event event2 = new Event();
		event2.setName("Making use of Patterns");
		event2.setLocation("Aarhus Music Hall");
		event2.setStartTime("14:15");
		event2.setEndTime("15:45");
		event2.setDate(2009, 10, 5);
		calendar.addEvent(event1);
	}
}
