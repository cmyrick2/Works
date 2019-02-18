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
public class Beetle {
	protected boolean body;
	protected boolean head;
	protected int legs;
	protected int eyes;
	protected int feelers;
	protected boolean tail;

	public Beetle() {
		this.body = false;
		this.head = false;
		this.legs = 0;
		this.eyes = 0;
		this.feelers = 0;
		this.tail = false;
	}

	public boolean isComplete() {
		if (body && head && (legs >= 6) && (eyes >= 2) && (feelers >= 2) && tail) {
			return true;
		} else {
			return false;
		}
	}

	public boolean addBody() {
		if (body) {
			return false;
		} else {
			body = true;
			return true;
		}
	}

	public boolean addHead() {
		if (head || !body) {
			return false;
		} else {
			head = true;
			return true;
		}
	}

	public boolean addLeg() {
		if ((legs >= 6) || !body) {
			return false;
		} else {
			legs++;
			return true;
		}
	}

	public boolean addEye() {
		if ((eyes >= 2) || !head) {
			return false;
		} else {
			eyes++;
			return true;
		}
	}

	public boolean addFeeler() {
		if ((feelers >= 2) || !head) {
			return false;
		} else {
			feelers++;
			return true;
		}
	}

	public boolean addTail() {
		if (tail || !body) {
			return false;
		} else {
			tail = true;
			return true;
		}
	}

	public String toString() {
		if (body) {
			String result = "";
			if (feelers > 0) {
				result += "\\";
				if (feelers == 2) {
					result += " /";
				}
				result += "\n";
			}
			if (head) {
				if (eyes > 0) {
					result += "o";
				} else {
					result += " ";
				}
				result += "O";
				if (eyes == 2) {
					result += "o";
				}
				result += "\n";
			}
			if (legs > 0) {
				result += "-";
			} else {
				result += " ";
			}
			result += "#";
			if (legs > 1) {
				result += "-";
			}
			result += "\n";
			if (legs > 2) {
				result += "-";
			} else {
				result += " ";
			}
			result += "#";
			if (legs > 3) {
				result += "-";
			}
			result += "\n";
			if (legs > 4) {
				result += "-";
			} else {
				result += " ";
			}
			result += "#";
			if (legs > 5) {
				result += "-";
			}
			if (tail) {
				result += "\n v";
			}
			return result;
		} else {
			return "(no parts yet)";
		}

	}
}
