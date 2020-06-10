package 三目並べ;

import java.util.ArrayList;
import java.util.Iterator;

public class Game {

	// TODO 自動生成されたメソッド・スタブ
	private Player currentPlayer; //そのターンのプレイヤー
	private Player firstPlayer;	//先攻プレイヤー
	private Player secondPlayer; //後攻プレイヤー
	private ArrayList<Turn> turns = new ArrayList<Turn>(); //ターンの保持（リスト）
	private Board board;
	
	//コンストラクタ
	public Game(Player firstPlayer,Player secondPlayer) {
		this.firstPlayer = firstPlayer;//先攻プレイヤー
		this.secondPlayer = secondPlayer;//後攻プレイヤー
		board = new Board();
		setBoard(board);
		board.showBoard();
	}
	
	//ゲームスタートメソッド
	public void start() {
		int count = 1;
		boolean judge1 = false;
		while(board.judgeDraw()==false) {
			//ターンごとのプレイヤーの切り替え
			if(count % 2 != 0) {
				setCurrentPlayer(firstPlayer);
				}else {
					setCurrentPlayer(secondPlayer);
				}
			Turn turn = new Turn(currentPlayer);
			turn.conduct(board);
			turns.add(turn);
			judge1 = board.judgeWin();
			//勝利ラインの有無の判定
			if(judge1 == true) {
				
				showWinner();
				showTurnLog();
				break;
			}
			board.showBoard();
			count++;
		}
		if(count == 10) {
				draw();
				showTurnLog();

		}
	}
	
	//ターン履歴の表示メソッド
	public void showTurnLog() {
		System.out.println("<ターン履歴>");
		Iterator<Turn> iter = turns.iterator();
		while(iter.hasNext()) {
			Turn turnIter = iter.next();
			turnIter.toString();
			System.out.println(turnIter);
		}
	}
	
	//盤面クラスのフィールドセッター
	public void setBoard(Board board) {
		this.board = board;
	}
	
	//勝者表示メソッド
	public void showWinner() {
		board.showBoard();
		System.out.println("勝者:" + currentPlayer.getOrder());
		System.out.println();
	}
	
	//現在ターンのプレイヤーをフィールドのセット
	public void setCurrentPlayer(Player player) {
		this.currentPlayer = player;
	}
	
	//引き分け表示メソッド
	public void draw() {
		System.out.println("引き分け");
		System.out.println();
	}
}
