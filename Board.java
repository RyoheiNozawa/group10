package java_game;

import java.util.ArrayList;

public class Board {
	
	public static final int SIZE = 3;//盤面のサイズ
	private ArrayList<Line> lines = new ArrayList<Line>();//勝利ライン（リスト）	//テスト時にはpublicに変更
	private Square[][] cells = new Square[SIZE][SIZE];//セルオブジェクト格納用
	
	//コンストラクタ
	public Board() {
		
		for(int y = 1; y <= SIZE; y++) {
			for(int x = 1; x <= SIZE; x++) {
				Square cell = new Square(x, y);
				cells[y-1][x-1] = cell;

			}
		}
		buildLine();
	}
	
	//盤面の表示メソッド
	public void showBoard() {
		for(int i = 0; i < 3; i++) {
			System.out.println("-------");
			for(int j = 0; j < 7; j++) {
				if(j % 2 == 0) {
					System.out.print("|");
				}else {
					Square cell = cells[i][j/2]; 
					if(cell.getMark() == Mark.CIRCLE) {
						System.out.print("○");
					}else if(cell.getMark() == Mark.CROSS) {
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
	public Square getCell(int x,int y) {
		return cells[y - 1][x - 1];
	}
	//勝利ライン(計8ライン)作成
	public void buildLine() {
		
		
		for(int i = 1; i <= SIZE; i ++) {
		Line line = new Line();
		for(int j = 1; j <= SIZE; j++) {
		line.addCell(this.getCell(j ,i));
		}
		lines.add(line);
		
		}
		for(int i = 1; i <= SIZE; i++) {
			Line line = new Line();
			for(int j = 1; j <= SIZE; j++) {
				line.addCell(this.getCell(i ,j));
			}
			lines.add(line);
			
		}
		Line line1 = new Line();
		for(int i = 1; i <= SIZE; i++) {
			
			line1.addCell(this.getCell(i ,i));
			
		}
		lines.add(line1);
		
		
		int j = 3;
		Line line2 = new Line();
		for(int i = 1; i <= SIZE; i++) {
			
			line2.addCell(this.getCell(i ,j));
			j--;	
		}
		lines.add(line2);
		
		
	}
	
	//１列でも揃ってるラインがあるかを確認
	public boolean isComplete() {
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
	public boolean isFilled() {
		boolean judge = true;
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				judge = cells[i][j].getStatus();
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
	
}

