/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.30.1.5099.60569f335 modeling language!*/

package ca.mcgill.ecse321.eventregistration.model;
import java.util.*;
import javax.persistence.*;

// line 3 "../../../../../EventRegistrationModel.ump"
// line 19 "../../../../../EventRegistrationModel.ump"
public class RegistrationManager
{
	
  //RegistrationManager Associations
  
	
  private List<Person> participants;
  
  @OneToMany(cascade= {CascadeType.ALL})
  public List<Person> getParticipants()
  {
    return this.participants;
  }
  
  public void setParticipants(List<Person> participants) {
	  this.participants = participants;
  }
  
  private List<Event> events;
  
  @OneToMany(cascade= {CascadeType.ALL})
  public List<Event> getEvents()
  {
    return this.events;
  }
  
  public void setEvents(List<Event> events) {
	  this.events = events;
  }
  
  private List<Registration> registrations;
  
  @OneToMany(cascade= {CascadeType.ALL})
  public List<Registration> getRegistrations()
  {
    return this.registrations;
  }
  
  public void setRegistration(List<Registration> registrations) {
	  this.registrations = registrations;
  }
  
  //------------------------
  // CONSTRUCTOR
  //------------------------

  public RegistrationManager()
  {
    participants = new ArrayList<Person>();
    events = new ArrayList<Event>();
    registrations = new ArrayList<Registration>();
  }

}