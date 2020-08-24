package com.gamingroom;

// Base Super Class
// This class serves as the parent class for the following child classes: Game, Team, and Player classes
public class Entity {

	//properties
	private long id;
	private String name;
	
	/*Constructors*/
	
	//Default Constructor
	public Entity() {
		
	}
	
	//Parameter constructor
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public String toString() {
		
		return "Entity [id=" + id + ", name=" + name + "]";
	}
	
	

}
