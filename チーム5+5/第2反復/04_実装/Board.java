package 三目並べ;

import java.util.ArrayList;

public class Board {
	
	public static final int SIZE = 3;//盤面のサイズ
	public ArrayList<Line> lines = new ArrayList<Line>();//勝利ライン（リスト）
	private Square[][] squares = new Square[SIZE][SIZE];//セルオブジェクト格納用
	
	//コンストラクタ
	public Board() {
		
		for(int y = 1; y <= SIZE; y++) {
			for(int x = 1; x <= SIZE; x++) {
				Square square = new Square(x, y);
				squares[y-1][x-1] = square;
			}
		}
		buildLine();
	}
	
	//盤面の表示メソッド
	public void showBoard() {
		for(int i = 0; i < SIZE; i++) {
			System.out.println("-------");
			for(int j = 0; j < SIZE * 2 + 1; j++) {
				if(j % 2 == 0) {
					System.out.print("|");
				}else {
					Square square = squares[i][j/2]; 
					if(square.getMark() == Mark.CIRCLE) {
						System.out.print("○");
					}else if(square.getMark() == Mark.CROSS) {
						System.out.print("×");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println("");
		}
		System.out.println("-------");
	}
	
	//座標に対応するセルの取得
	public Square getSquare(int x,int y) {
		return squares[y - 1][x - 1];
	}
	//勝利ライン(計8ライン)作成
	private void buildLine() {
		
		
		for(int i = 1; i <= SIZE; i ++) {
		Line line = new Line();
		for(int j = 1; j <= SIZE; j++) {
		line.addSquare(this.getSquare(j ,i));
		}
			this.addLine(line);
		
		}
		for(int i = 1; i <= SIZE; i++) {
			Line line = new Line();
			for(int j = 1; j <= SIZE; j++) {
				line.addSquare(this.getSquare(i ,j));
			}
			this.addLine(line);
			
		}
		Line line1 = new Line();
		for(int i = 1; i <= SIZE; i++) {
			
			line1.addSquare(this.getSquare(i ,i));
			
		}
		this.addLine(line1);
		
		
		int j = 3;
		Line line2 = new Line();
		for(int i = 1; i <= SIZE; i++) {
			
			line2.addSquare(this.getSquare(i ,j));
			j--;	
		}
		this.addLine(line2);
		
		
	}
	
	//１列でも揃ってるラインがあるかを確認
	public boolean judgeWin() {
		boolean judge = true;
		for(Line line : lines) {
			judge = line.checkLine();
			if(judge == true) {
				break;
			}
		}
		return judge;
	}
	
	//全てのマスが埋まっているかの確認
	public boolean judgeDraw() {
		boolean judge = true;
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				judge = squares[i][j].checkStatus();
				if(judge == false) {
					break;
				}
		}
			if(judge == false) {
				break;
		
			}
		}
			return judge;
	}
	
	//ラインのリストへの追加
	public void addLine(Line line) {
		this.lines.add(line);
	}
	
}

