package game;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Elfo extends Character {
	final Logger logger = LoggerFactory.getLogger(Elfo.class);
	
	/**
	* Constructor of Elfo thar receives as argument a WeaponBehaviour.
	*
	* @param w Weapon with which the Elfo will fight
	*/
	public Elfo(WeaponBehaviour w) {
		super(w);
	}
	
	@Override
	public void display() {
	// TODO Auto-generated method stub
		logger.info("You are a strong, hulky Elfo!!!..");
		System.out.println("Modified from AB?");
	}
}
