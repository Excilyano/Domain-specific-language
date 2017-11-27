package calendar;

import java.util.ArrayList;

public class Calendar {
	private ArrayList<Event> events;
	
	public Calendar() {
		events = new ArrayList<Event>();
	}
	
	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}

	public void addEvent(Event e){
		events.add(e);
	}
	
	public String toString(){
		String result = "calendar {\n";
		for (Event e:events) 
			result += e.toString()+"\n";
		result += "}";
		return result;
	}
}
