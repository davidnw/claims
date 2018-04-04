package uk.co.simplyhealth.healthplan.claims;

import java.util.*;

public class Claim {
	
	private String title;       // The users title
	private Date creationDate;  // The creation date of the claim
	private UUID planId;        // The plan that is being claimed against
	private UUID benifitId;     // The specific benifit that's been claimed
	private String status;      // The status of the claim
	private Map<Date, String> notes; // A set of note created against the claim **MAY BE SUPERCEEDED IF EVENT BASED ARCHITECTURE IS ADOPTED**
	private Map<String, Object> details;
	
	public Claim(String title, Date creationDate, UUID planId, UUID benifitId, String status, Map<Date, String> notes,
			Map<String, Object> details) {
		super();
		this.title = title;
		this.creationDate = creationDate;
		this.planId = planId;
		this.benifitId = benifitId;
		this.status = status;
		this.notes = notes;
		this.details = details;
	}
	
	public Map<String, Object> getDetails() {
		return details;
	}
	public void setDetails(Map<String, Object> details) {
		this.details = details;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public UUID getPlanId() {
		return planId;
	}
	public void setPlanId(UUID planId) {
		this.planId = planId;
	}
	public UUID getBenifitId() {
		return benifitId;
	}
	public void setBenifitId(UUID benifitId) {
		this.benifitId = benifitId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Map<Date, String> getNotes() {
		return notes;
	}
	public void setNotes(Map<Date, String> notes) {
		this.notes = notes;
	}



}
