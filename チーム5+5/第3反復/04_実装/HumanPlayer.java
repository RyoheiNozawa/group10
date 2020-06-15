package 第3反復三目並べ;

import java.util.Scanner;

public class HumanPlayer extends Player{
	private Scanner scanner = new Scanner(System.in);

	public HumanPlayer(String order, Mark mark) {
		super(order, mark);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	@Override
	public Square inputCoodinate(Board board) {
		int x = 0;
		int y = 0;
		
		Square square;
		
		while(true) {
			
			while(true) {
				System.out.println("座標を半角スペースで区切って入力して下さい(例：2列目の3行目→ 2 3)");
				try {
					x = Integer.parseInt(scanner.next());
					y = Integer.parseInt(scanner.next());
				
					if(x > 0 && x <= Board.SIZE 
							&& y > 0 && y <= Board.SIZE) {
						break;
					
					}else{
						System.err.println("1～3の範囲で入力してください");
						}
				}catch(NumberFormatException e) {
				
					System.err.println("入力値が正しくありません、半角で入力してください");
			
				}
			
			}	
			square = board.getSquare(x, y);
		
			if(square.checkStatus() == false) {
				
				break;
			}else {
				System.err.println("既に置かれています");
			}
		
			
		}	return square;
	}

}
