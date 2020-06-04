package java_game;

import java.util.ArrayList;

public class Line {
	
	ArrayList<Square> cells;//セル
	
	//コンストラクタ
	public Line() {
		cells = new ArrayList<Square>();
	}
	
	//3つのマークがそろっているか判定
	public boolean checkLine() {
		boolean judge = true;
		Mark mark = cells.get(0).getMark();
		Mark otherMark;
		if(mark == Mark.NONE) {
			judge = false;
			return judge;
		}else {
			for(int i = 1; i <= cells.size() - 1; i++ ) {
				otherMark = cells.get(i).getMark();
				if(mark != otherMark) {
					judge = false;
					break;
				}
			}
			return judge;
		}
	}
	
	//セルをリストに追加
	public void addCell(Square cell) {
		cells.add(cell);
		
	}
}
