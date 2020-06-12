package 第3反復三目並べ;

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
	public Square checkEmpty() {
		Square square = null;
		int count = 0;
		for(int i =0; i < squares.size() ;i++){ 
		if(squares.get(i).checkStatus() == true) {
		count++;
		}
		}if(count == 2){
			Mark mark = squares.get(0).getMark();
			for(int i =1; i < squares.size() ;i++){
				if(squares.get(i).getMark() == mark) {
					if(i == 1) {
						square = squares.get(2);
					}else square = squares.get(1);
				}else if(squares.get(1).getMark() == squares.get(2).getMark()){
				square = squares.get(0);
				}
			}
		}else square = null;
		return square;
	}
}
