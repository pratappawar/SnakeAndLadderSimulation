
package com.snakeladder;

public class SnakeLadderBuilder {

	public static final int FINAL_POS = 100;

	public static void main(String[] args) {

		int playerA_pos = 0;
		int playerB_pos = 0;
		System.out.println("!!!Welcome to Snake Ladder Simulation!!!");
		System.out.println("--------------------------------------------");
		while (playerA_pos < FINAL_POS && playerB_pos < FINAL_POS) {

			int Die = (int) (Math.random() * 6) + 1;
			System.out.println("Number got on Dice: " + Die);

			int CheckOpt = (int) (Math.random() * 3) + 1;
			// 1:ladder 2:Snake 3:No play
			System.out.println("Checking option: " + CheckOpt);

			switch (CheckOpt) {
			case 1: // Ladder
				playerA_pos = playerA_pos + Die;
				System.out.println("Position of the player A: " + playerA_pos);
				System.out.println("--------------------------------------------");
				break;
			case 2: // Snake
				playerA_pos -= Die;
				System.out.println("Position of the player A: " + playerA_pos);
				System.out.println("--------------------------------------------");
				break;
			case 3: // No play
				System.out.println("The player-->A Skip 1 Chance position is: " + playerA_pos);
				System.out.println("--------------------------------------------");
				break;
			}
		}
	}
}