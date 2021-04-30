
package com.snakeladder;

public class SnakeLadderBuilder {

	public static final int FINAL_POS = 100;
	public static boolean isPlayer = true;

	public static void main(String[] args) {

		int playerA_pos = 0;
		int playerB_pos = 0;
		int no_Of_Die = 0;
		System.out.println("!!!Welcome to Snake Ladder Simulation!!!");
		System.out.println("--------------------------------------------");
		while (playerA_pos < FINAL_POS && playerB_pos < FINAL_POS) {
			no_Of_Die++;
			int Die = (int) (Math.random() * 6) + 1;
			System.out.println("Number got on Dice: " + Die);

			int CheckOpt = (int) (Math.random() * 3) + 1;
			// 1:ladder 2:Snake 3:No play
			System.out.println("Checking option: " + CheckOpt);

			switch (CheckOpt) {
			case 1:// Ladder
				if (isPlayer) {
					if ((playerA_pos + Die) <= FINAL_POS)
						playerA_pos = playerA_pos + Die;
					isPlayer = false;
					System.out.println("Position of the player A: " + playerA_pos);
					System.out.println("--------------------------------------------");
				} else {
					isPlayer = true;
					if ((playerB_pos + Die) <= FINAL_POS)
						playerB_pos = playerB_pos + Die;
					System.out.println("Position of the player B: " + playerB_pos);
					System.out.println("--------------------------------------------");
				}
				break;
			case 2: // Snake
				if (isPlayer) {
					isPlayer = false;
					playerA_pos -= Die;
					if ((playerA_pos - Die) < 0)
						playerA_pos = 0;
					System.out.println("Position of the player A: " + playerA_pos);
					System.out.println("--------------------------------------------");
				} else {
					isPlayer = true;
					playerB_pos -= Die;
					if ((playerB_pos - Die) < 0)
						playerB_pos = 0;
					System.out.println("Position of the player B : " + playerB_pos);
					System.out.println("--------------------------------------------");
				}
				break;
			case 3: // No play
				if (isPlayer) {
					isPlayer = false;
					System.out.println("The player-->A Skip 1 Chance position is: " + playerA_pos);
					System.out.println("--------------------------------------------");
				} else {
					isPlayer = true;
					System.out.println("The player-->B Skip 1 Chance position is: " + playerB_pos);
					System.out.println("--------------------------------------------");
				}
				break;
			}
		}
		System.out.println("Number of Time Die Rolled: " + no_Of_Die);
		System.out.println("----------------------------------------");

		/// Checking who won the Game
		if (playerA_pos == FINAL_POS) {
			System.out.println("***********Player A won the Game************");
		} else {
			System.out.println("***********Player B won the Game************");
		}

	}
}