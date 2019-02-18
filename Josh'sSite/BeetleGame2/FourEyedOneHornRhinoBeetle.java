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
public class FourEyedOneHornRhinoBeetle extends FourEyedBeetle {
	public int horn;
        
	public boolean addHorn() {
	if((horn<1) && head){
        horn++;
        return true;
        }else{
        return false;
        }
	}
	
	public boolean addEye() {
	if ((eyes >= 4) || !head) {
			return false;
		} else {
			eyes++;
			return true;
		}
	}
	
	public String toString() {
	if (body) {
			String result = "";
			if (feelers > 0) {
				result += "\\";
                                if(horn > 0){
                                    result += "|";
                                }
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
