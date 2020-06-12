package 第3反復三目並べ;

import java.util.Scanner;

public class Main {
	final static Scanner scanner = new Scanner(System.in);
	static HumanPlayer firstPlayer = new HumanPlayer("先攻",Mark.CIRCLE);
	static HumanPlayer secondPlayer = new HumanPlayer("後攻",Mark.CROSS);
	static ComputerPlayer normalNPC = new ComputerPlayer("後攻",Mark.CROSS);
	static HardComputerPlayer hardNPC = new HardComputerPlayer("先攻",Mark.CIRCLE);
	public static void main(String[] args) {
//		HumanPlayer firstPlayer = new HumanPlayer("先攻",Mark.CIRCLE);
//		HumanPlayer secondPlayer = new HumanPlayer("後攻",Mark.CROSS);
//		ComputerPlayer NPC = new ComputerPlayer("後攻",Mark.CROSS);
//		ComputerPlayer NPC1 = new ComputerPlayer("先攻",Mark.CIRCLE);
		
		Choice choice = new Choice();
		
		while(true) {
		    int a = choice.select();
			if(a==0) {
				Game game = new Game(firstPlayer, normalNPC);
				//ゲームスタート
				game.start();
				break;
			}else if(a==1) {
				Game game = new Game(hardNPC, secondPlayer);
				//ゲームスタート
				game.start();
				break;
			}else if(a==2) {
				Game game = new Game(firstPlayer, secondPlayer);
				//ゲームスタート
				game.start();
				break;
			}else {
				System.out.println("もっかい入力");
			}
		}
				
	    
	}
	
}
