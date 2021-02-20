package ca.mcgill.ecse321.eventregistration.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Id;

@Entity
public class Registration{
	private Person person;
	
	@ManyToOne
	public Person getPerson() {
		return this.person;
	}
	
	public void setPerson(Person aPerson) {
		this.person = aPerson;
	}
	
	private Event event;
	
	@ManyToOne
	public Event getEvent() {
		return this.event;
	}
	
	public void setEvent(Event anEvent) {
		this.event = anEvent;
	}
	
	private Integer id;
	
	@Id
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer value) {
		this.id = value;
	}
}