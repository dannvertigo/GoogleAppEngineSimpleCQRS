package com.simplecqrs.appengine.example;

import java.util.UUID;

/**
 * Simple command to register an attendee
 */
public class RegisterAttendeeCommand {
	
	private String firstName = null;
	private String lastName = null;
	private UUID attendeeId = null;
	
	/**
	 * Default constructor for serialization
	 */
	public RegisterAttendeeCommand(){
		this.attendeeId = UUID.randomUUID();
	}
	
	/**
	 * Constructor
	 * 
	 * @param firstName
	 * @param lastName
	 */
	public RegisterAttendeeCommand(String firstName, String lastName){
		this();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public UUID getAttendeeId(){
		return attendeeId;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
}
