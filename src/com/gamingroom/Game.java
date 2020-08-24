package com.gamingroom;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * A simple class to hold information about a game
 * 
 * <p>
 * Notice the overloaded constructor that requires
 * an id and name to be passed when creating.
 * Also note that no mutators (setters) defined so
 * these values cannot be changed once a game is
 * created.
 * </p>
 * 
 * @author coce@snhu.edu
 *
 */
public class Game extends Entity {
	
	// Holds all the existing teams
	private static List<Team> teams = new ArrayList<Team>();
	
	/**
	 * Hide the default constructor to prevent creating empty instances.
	 */
	private Game() {
	}

	/**
	 * Constructor with an identifier and name
	 */
	
	// Parameter constructor that calls the Base class Entity Constructor 
	// Will set the id and name properties that are inherited from the Entity Base Class
	public Game(long id, String name) {
		super(id, name);
	}
	
	// FIXME: Add function that adds team to team list
		/*
		 * @return: new team
		 * @parameter: name-String 
		 */
		public Team addTeam(String name) {
			
			// local player instance
			Team team = null;
			
			// FIXME: Use iterator for look for any existing team with the same name
			// Implement iterator pattern to traverse Player list
			Iterator<Team> teamIterator = teams.iterator();
			
			// Go through tea,Iterator and see if there exists a team with the same name that is passed as a parameter
			// If the team with the same name exists, return that existing team
			// else add new team  to teams list
			// Implementation of the iterator allows us to traverse any data structure(list, array,etc) in a the same way
			// An iterator provides us simple tools for traversing the data.
			while(teamIterator.hasNext()) {
				team = teamIterator.next();
				if(team.getName().equals(name)) {
					break;
				}
				
				team = null;
			}
			
			// if no team is found, add new team instance to teams list
			if(team == null) {
				team = new Team(teams.size()+1,name);
				teams.add(team);
			}
			
			// return team
			return team;
			
		}

	@Override
	public String toString() {
		
		return "Game [id=" + this.getId() + ", name=" + this.getName() + "]";
	}

}
