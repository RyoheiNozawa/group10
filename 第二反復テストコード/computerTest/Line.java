package 三目並べ;

import java.util.ArrayList;

public class Line {
	
	ArrayList<Square> squares;//セル
	
	//コンストラクタ
	public Line() {
		squares = new ArrayList<Square>();
	}
	
	//3つのマークがそろっているか判定
	public boolean checkLine() {
		boolean judge = true;
		Mark mark = squares.get(0).getMark();
		Mark otherMark;
		if(mark == Mark.NONE) {
			judge = false;
			return judge;
		}else {
			for(int i = 1; i <= squares.size() - 1; i++ ) {
				otherMark = squares.get(i).getMark();
				if(mark != otherMark) {
					judge = false;
					break;
				}
			}
			return judge;
		}
	}
	
	//セルをリストに追加
	public void addSquare(Square square) {
		squares.add(square);
		
	}
}
