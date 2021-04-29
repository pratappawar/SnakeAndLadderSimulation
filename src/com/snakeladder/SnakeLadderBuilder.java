
package com.snakeladder;

public class SnakeLadderBuilder {

	public static boolean isPlayer=true;
	public static final int FINAL_POS=100;
	public static void main(String[] args) {
		
		int initial_position=0;
		int No_Of_Die=0;
		int playerA_pos=0;
		int playerB_pos=0;
		System.out.println("!!!Welcome to Snake Ladder Simulation!!!");
		
		int Die = (int)(Math.random()*6) + 1;
		No_Of_Die++;
		System.out.println("Number get on Dice: "+Die);
	}

}