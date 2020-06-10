package 三目並べ;



public class Main {
	public static void main(String[] args) {
		

		
		//プレイヤーの作成
		Player firstPlayer = new Player("先攻",Mark.CIRCLE);
		
		Player secondPlayer = new Player("後攻",Mark.CROSS);
		
		//ゲーム作成
		Game game = new Game(firstPlayer, secondPlayer);
		
		//ゲームスタート
		game.start();


	}
}
