package 三目並べ;



public class Main {
	public static void main(String[] args) {
		

		
		//プレイヤーの作成
		HumanPlayer firstPlayer = new HumanPlayer("先攻",Mark.CIRCLE);
		
		ComputerPlayer secondPlayer = new ComputerPlayer("後攻",Mark.CROSS);
		
		//ゲーム作成
		Game game = new Game(firstPlayer, secondPlayer);
		
		//ゲームスタート
		game.start();


	}
}
