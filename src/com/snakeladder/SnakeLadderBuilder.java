package com.snakeladder;

public class SnakeLadderBuilder {

	public static void main(String[] args) {
		int A_pos=0;
		int B_pos=0;
		int A_flag=0;  //not play
		int B_flag=1;  //play on
		int rollDice=0;
		int A_posTemp;
		int B_posTemp;
		System.out.println("!!**Welcome to Snake and Ladder Simulation**!!");
		
		rollDice++;     //taking status for dice rolling
		int Dice_A=(int)(Math.floor(Math.random()*10)%6 + 1);
		System.out.println("Getting Dice number:"+Dice_A);

	}

}
