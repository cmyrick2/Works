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
public class Dice {
    final static int FACES = 6;
	private int topValue;
	
	public Dice() {
		topValue = 0;
	}
	
	public void roll() {
		topValue = (int)(Math.random() * FACES) + 1;
	}
	
	public int getTopValue() {
		return topValue;
	}
	
	public void setTopValue(int value) {
		if( value > 0 && value < 7) {
			topValue = value;
		}
	}
}
