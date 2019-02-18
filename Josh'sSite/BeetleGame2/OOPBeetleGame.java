/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopbeetlegame;

/**
 *
 * @author Fishi
 */
public class OOPBeetleGame {

    final static int PLAYERS = 2;

	private Dice die;
	private Beetle[] bugs;

	public OOPBeetleGame() {
		die = new Dice();
		bugs = new Beetle[PLAYERS];
		for (int i = 0; i < bugs.length; i++) {
			bugs[i] = new Beetle();
		}
		play();
	}
        
        public OOPBeetleGame(boolean FourEyedBeetle) {
		die = new Dice();
		bugs = new Beetle[PLAYERS];
                
		if (FourEyedBeetle) {
			for (int i = 0; i < bugs.length; i++) {
			bugs[i] = new FourEyedBeetle();}
		}else{
                    for (int i = 0; i < bugs.length; i++) {
			bugs[i] = new Beetle();
		}
                }
		play();
	}

	public void play() {
		int i = 0;
		Beetle bug = bugs[i];
		while (!(bug.isComplete())) {
			// runs until the player rolls wrong.
			if (!takeTurn(i + 1, bug)) {
				// sets player to the other one
				i = (i + 1) % PLAYERS;
				bug = bugs[i];
			}
		}
		System.out.println("Player " + (i + 1) + " wins");
		System.out.println(bug.toString());
	}

	public boolean takeTurn(int player, Beetle beetle) {
		die.roll();
		int roll = die.getTopValue();
		switch (roll) {
		case 1:
			return beetle.addBody();
		case 2:
			return beetle.addHead();
		case 3:
			return beetle.addLeg();
		case 4:
			return beetle.addEye();
		case 5:
			return beetle.addFeeler();
		case 6:
			return beetle.addTail();
		}
		return false;
	}

	public static void main(String[] args) {
		OOPBeetleGame game = new OOPBeetleGame(true);
                
	}
    
}
