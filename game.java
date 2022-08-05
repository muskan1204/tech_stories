package ineuron;

import java.util.Scanner;

class guesser {
	public static int num;
	Scanner sc = new Scanner(System.in);

	public void guess() {
		System.out.println("\n \n umpire-guesser: Hey guesser, please give me number (0-20)! ");

		num = sc.nextInt();
	}
}

class umpire {

	guesser g1 = new guesser();
	public int numfromguesser;
	int plquantity;
	int numfromplayer1;
	int numfromplayer2;
	int numfromplayer3;
	int lasttryp1;
	int lasttryp2;
	int lasttryp3;

	player p1 = new player();
	player p2 = new player();
	player p3 = new player();

	Scanner sc = new Scanner(System.in);

	public void hint() {
		if (plquantity == 1) {
			if (guesser.num <= 10) {
				System.out.print("Umpire-players:your number is in the range of:" + guesser.num * 0.5);
				System.out.print("to");
				System.out.println(guesser.num * 2);
			} else {
				System.out.print("Umpire-players:your number is in the range of:" + guesser.num * 0.5);
				System.out.print("to");
				System.out.println(guesser.num + 5);
			}

			lasttryp1 = p1.playerlasttry();
		} else if (plquantity == 2) {
			if (guesser.num <= 10) {
				System.out.print("Umpire-players:your number is in the range of:" + guesser.num * 0.5);
				System.out.print("to");
				System.out.println(guesser.num * 2);
			} else {
				System.out.print("Umpire-players:your number is in the range of:" + guesser.num * 0.5);
				System.out.print("to");
				System.out.println(guesser.num + 5);
			}
			lasttryp1 = p1.playerlasttry();
			lasttryp2 = p2.playerlasttry();
		} else {
			if (guesser.num <= 10) {
				System.out.print("Umpire-players:your number is in the range of:" + guesser.num * 0.5);
				System.out.print("to");
				System.out.println(guesser.num * 2);
			} else {
				System.out.print("Umpire-players:your number is in the range of:" + guesser.num * 0.5);
				System.out.print("to");
				System.out.println(guesser.num + 5);
			}
			lasttryp1 = p1.playerlasttry();
			lasttryp2 = p2.playerlasttry();
			lasttryp3 = p3.playerlasttry();

		}
	}

	public void check() {
		if (guesser.num == lasttryp1) {
			if (guesser.num == lasttryp2 && guesser.num == lasttryp3) {
				System.out.println("game tied.. everyone guessed correctly!\n\n WINNER WINNER CHEESY DINNER :)");
				System.out.println("your IQ is good..");

			} else if (guesser.num == lasttryp2) {
				System.out.println("player 1 & 2 won the game!\n\n WINNER WINNER CHEESY DINNER :)");
				System.out.println("your IQ is good..");

			} else if (guesser.num == lasttryp3) {
				System.out.println(" player 1 & 3 won the game!\n\n WINNER WINNER CHEESY DINNER :)");
				System.out.println("your IQ is good..");
			} else
				System.out.println("player 1 won the game!\n\n WINNER WINNER CHEESY DINNER :)");
			System.out.println("your IQ is good..");
		}

		else if (guesser.num == lasttryp2) {
			if (guesser.num == lasttryp3) {
				System.out.println("Player 2 and Player3 won the game!\n\n WINNER WINNER CHEESY DINNER :)");
				System.out.println("your IQ is good..");
			} else {
				System.out.println("Player 2 won the game!\n\n WINNER WINNER CHEESY DINNER :)");
				System.out.println("your IQ is good..");
			}
		} else if (guesser.num == lasttryp3) {
			System.out.println("player 3 won!\n\n WINNER WINNER CHEESY DINNER :)");
			System.out.println("your IQ is good..");

		}

		else {
			System.out.println("you couldn't guess!!\n\n BETTER LUCK NEXT TIME :(");
			System.out.println("your IQ is very lowwww......");

		}
		switch1();

	}

	public void switch1() {
		System.out.println("****************************************************************");
		System.out.println(" Lets start the game please? \n press 1: to start \n 2: exit");

		int i = sc.nextInt();

		if (i == 1) {
			System.out.println(" \n \n LET'S BEGIN!\n");
			System.out.println("how many players are you?");
		} else if (i == 2) {
			System.out.println(" thankyou for playing!");
			System.exit(0);
		} else {
			System.out.println("enter correct choice");
			switch1();
		}
		System.out.println("press : \n 1: single\n 2: double \n 3: triple\n 4: exit");
		plquantity = sc.nextInt();
		switch (plquantity) {
		case 1:
			System.out.println("\n*SOLO PLAYER*\n");
			rules();
			g1.guess();
			player p1 = new player();
			numfromplayer1 = p1.playernumber();
			if (guesser.num == numfromplayer1) {
				System.out.println("HURRAYYYYYY....\n youu wonn!!...");
				System.out.println("\nyourrr IQ is excellent!!");

				switch1();
			} else {
				System.out.println("OOPS...you couldn't guess\n BETTER LUCK NEXT TIME.. ");
				System.out.println("your IQ is low..");
				System.out.println("****************************************************************");
				System.out.println("want hint?\n press\n 1:hint\n 2: exit ");

				int hi = sc.nextInt();
				if (hi == 1) {
					System.out.println("you pressed hint!! \n\n I AM HINTBOX!! \n HERE TO HELP YOU!\n");
					hint();
					check();
				} else if (i == 2) {
					System.out.println(" thankyou for playing!");
					switch1();
					System.exit(0);
				} else {
					System.out.println("press correct option please!");
					System.exit(0);
					switch1();
				}

			}
			break;
		case 2:
			System.out.println("\n*DUAL PLAYER*\n");
			rules();
			g1.guess();
			player P1 = new player();
			player p2 = new player();
			numfromplayer1 = P1.playernumber();
			numfromplayer2 = p2.playernumber();
			if (guesser.num == numfromplayer1) {
				if (guesser.num == numfromplayer2) {
					System.out.println("Player 1 & Player2 won the game!\nplay again?");
					System.out.println("your IQ is excellent..");
					switch1();
				} else {
					System.out.println("Player 1 won the game!\n play again?");
					System.out.println("your IQ is excellent..");
					switch1();
				}
			} else if (guesser.num == numfromplayer2) {
				System.out.println("player 2 won!\nplay again?");
				System.out.println("your IQ is excellent..");
				switch1();
			} else {
				System.out.println("game lost.. no one could guess the number correctly!!\n");
				System.out.println("your IQ is low....");
				System.out.println("***************************************************************");
				System.out.println("want hint?\n press\n 1:hint\n 2: exit ");
				int hi = sc.nextInt();
				if (hi == 1) {
					System.out.println("you pressed hint!! \n\n I AM HINTBOX!! \n HERE TO HELP YOU!\n");
					hint();
					check();
				} else if (i == 2) {
					System.out.println(" thankyou for playing!");
					System.out.println("****************************************************************");
					System.exit(0);
				} else {
					System.out.println("press correct option please!");

					switch1();
				}
			}
			break;
		case 3:
			System.out.println("\n*TRIPLE PLAYER*\n");
			rules();
			g1.guess();
			player Pl1 = new player();
			player P2 = new player();
			player P3 = new player();
			numfromplayer1 = Pl1.playernumber();
			numfromplayer2 = P2.playernumber();
			numfromplayer3 = P3.playernumber();
			if (guesser.num == numfromplayer1) {
				if (guesser.num == numfromplayer2 && guesser.num == numfromplayer3) {
					System.out.println("game tied.. everyone guessed correctly!\n play again?");
				} else if (guesser.num == numfromplayer2) {
					System.out.println("player 1 & 2 won the game!\nplay again?");
					System.out.println("your IQ is excellent..");

				} else if (guesser.num == numfromplayer3) {
					System.out.println(" player 1 & 3 won the game!\n play again?");
					System.out.println("your IQ is excellent..");

				} else
					System.out.println("player 1 won the game!\n play again?");
				System.out.println("your IQ is excellent..");

			}

			else if (guesser.num == numfromplayer2) {
				if (guesser.num == numfromplayer3) {
					System.out.println("Player 2 and Player3 won the game!\nplay again?");
					System.out.println("your IQ is excellent..");

				} else {
					System.out.println("Player 2 won the game!\n play again?");
					System.out.println("your IQ is excellent..");

				}
			} else if (guesser.num == numfromplayer3) {
				System.out.println("player 3 won!\nplay again?");
				System.out.println("your IQ is excellent..");

			}

			else {
				System.out.println("game lost.. no one could guess the number correctly!!\n");
				System.out.println("yourr IQ is loww....");
				System.out.println("***************************************************************");
				System.out.println("want hint?\n press\n 1:hint\n 2: exit ");

				int hi = sc.nextInt();
				if (hi == 1) {
					System.out.println("you pressed hint!! \n\n I AM HINTBOX!! \n HERE TO HELP YOU!\n");
					hint();
					check();
				} else if (i == 2) {
					System.out.println(" thankyou for playing!");
					System.out.println("****************************************************************");
					System.exit(0);
				} else {
					System.out.println("press correct option please!");
					System.exit(0);
					switch1();

				}

			}
			switch1();
			break;
		case 4:
			System.out.println(" thankyou for playing!");
			System.exit(0);
			break;

		default:
			System.out.println(" please,   press the choice correctly...");
			switch1();
			break;
		}

	}

	public void rules() {
		System.out.println(
				"umpire-players: So rules are:\n1: you will get 1 chance to guess only! \n2: if all players failed to guess one hints will be provided by hintbox!! \n3: player who will guess correctly will win!\n4: if all players guess correctly game will be draw!\n5: You have to guess from 0-20 \n6: IQ will be determined at the last....");
	}

}

class player {

	Scanner sc = new Scanner(System.in);
	public int playernum;
	public int playertry;

	public int playernumber() {
		System.out.println("players-umpire: Okay! my number is:\n");

		int playernum = sc.nextInt();

		return playernum;

	}

	public int playerlasttry() {
		System.out.println("Players-umpire:okaayy.. so my last guess is:");
		playertry = sc.nextInt();
		return playertry;
	}
}

public class game {
	public static void main(String[] args) {
		umpire u1 = new umpire();
		u1.switch1();

	}
}
