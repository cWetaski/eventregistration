package ca.mcgill.ecse321.eventregistration.model;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Event
{
	
  private String name;
  
  public void setName(String aName) {
	  this.name = aName;
  }
  
  @Id
  public String getName() {
	  return this.name;
  }

  private Date date;
  
  public void setDate(Date aDate) {
	  this.date = aDate;
  }
  
  public Date getDate() {
	  return this.date;
  }
  
  private Time startTime;
  
  public void setStartTime(Time aStartTime) {
	  this.startTime = aStartTime;
  }
  
  public Time getStartTime() {
	  return this.startTime;
  }

  private Time endTime;
  
  public void setEndTime(Time anEndTime) {
	  this.endTime = anEndTime;
  }
  
  public Time getEndTime() {
	  return this.endTime;
  }
}