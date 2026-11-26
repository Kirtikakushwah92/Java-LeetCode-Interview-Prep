/*
Alice and Bob are playing a game where they take turns removing stones from a pile, with Alice going first.

Alice starts by removing exactly 10 stones on her first turn.
For each subsequent turn, each player removes exactly 1 fewer stone than the previous opponent.
The player who cannot make a move loses the game.

Given a positive integer n, return true if Alice wins the game and false otherwise.
*/

class Stone_Removal_Game_3360{
	public static void main(String[]args){
		int n = 12;
		boolean result = removeStone(n);
		System.out.println(result);
	}
	public static boolean removeStone(int n){
		int remove = 10;
		boolean aliceTurn = true;
		while(n>=remove){
			n = n - remove;
			remove--;
			aliceTurn = !aliceTurn;
		}
	return !aliceTurn;
	}
}