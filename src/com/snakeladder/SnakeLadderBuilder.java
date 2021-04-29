
package com.snakeladder;

public class SnakeLadderBuilder {

	public static void main(String[] args) {
		int A_pos=0;
		int B_pos=0;
		int B_flag=1;  //play on
		int rollDice=0;
		System.out.println("!!**Welcome to Snake and Ladder Simulation**!!");
		
		while(A_pos <=100) {
			rollDice++;     //taking status for dice rolling
			int Dice_A=(int)(Math.floor(Math.random()*10)%6 + 1);
			System.out.println("Getting Dice number:"+Dice_A);
			
			       //player A
			int checkOpt=(int)(Math.random()*10)%3+1;
			System.out.println("Checking choice:"+checkOpt);
			
			//checking ladder or snake checkOpt 1: ladder,checkOpt=2-->snake
			
			switch(checkOpt) {
			case 1:{
				System.out.println("Choice is for Ladder..");
				A_posTemp=A_pos;
				A_pos+=Dice_A;
				System.out.println("Position of die now:"+A_pos);
				break;
			}
			case 2:{
				System.out.println("Choice is for Snake-->");
				A_posTemp=A_pos;
				A_pos-=Dice_A;
				System.out.println("Position of die now:"+A_pos);
				break;
			}
			default:
				System.out.println("**NO PLAY**");
			}
		
		
		}
	}

}